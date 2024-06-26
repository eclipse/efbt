# coding=UTF-8#
# Copyright (c) 2020 Bird Software Solutions Ltd
# This program and the accompanying materials
# are made available under the terms of the Eclipse Public License 2.0
# which accompanies this distribution, and is available at
# https://www.eclipse.org/legal/epl-2.0/
#
# SPDE-License-Identifier: EPL-2.0
#
# Contributors:
#    Neil Mackenzie - initial API and implementation
#


'''
@author: Neil
'''
import csv
import os
from regdna import RulesForILTable,  SelectColumnAttributeAs , ELOperation
from regdna import RuleForILTablePart , RulesForReport, ELClass, ELEnum, ELAttribute,CellBasedReport
from utils.ldm_search import ELDMSearch


class GenerationRuleCreator(object):
    '''
    GenerationRuleCreator class is responsible for the generation 
    of generation rules
    '''

    def generate_generation_rules(self, context,sdd_context, framework, cube_type):
        '''
        generate generation rules
        '''
        GenerationRuleCreator.add_reports(self, context,sdd_context, framework, cube_type)
    
       
    def add_reports(self, context,sdd_context, framework, cube_type):
        '''
        Create the generation rule for each report that is in scope.
        '''
        file_location = context.file_directory + os.sep + "in_scope_reports_" + framework + ".csv"

        if framework == "FINREP_REF":
            if cube_type == 'EIL':
                generation_rules_module = context.finrep_generation_rules_module_il
            elif cube_type == 'ELDM':
                generation_rules_module = context.finrep_generation_rules_module_ldm            
        elif framework == "AE_REF":
            if cube_type == 'EIL':
                generation_rules_module = context.ae_generation_rules_module_il
            elif cube_type == 'ELDM':
                generation_rules_module = context.ae_generation_rules_module_ldm

        if cube_type == 'ELDM':

            GenerationRuleCreator.create_ldm_entity_to_linked_entities_map(self, context, sdd_context)
        

        header_skipped = False
        # Loop through the list of in scope reports
        with open(file_location,  encoding='utf-8') as csvfile:
            filereader = csv.reader(csvfile, delimiter=',', quotechar='"')
            for row in filereader:
                # skip the first line which is the header.
                if (not header_skipped):
                    header_skipped = True
                else:
                    report_template = row[0]
                    rules_for_report = RulesForReport()
                    
                    generated_output_layer = GenerationRuleCreator.\
                        find_output_layer_cube(self, context,
                                               report_template + "_REF_OutputItem", 
                                               framework, cube_type)
                    if not (generated_output_layer is None):
                        generation_rules_module.rulesForReport.append(
                                                                rules_for_report)
                        rules_for_report.outputLayerCube = generated_output_layer
                        GenerationRuleCreator.add_table_parts(
                                                    self, context,sdd_context,
                                                    rules_for_report,report_template, 
                                                    framework, cube_type)


    def create_ldm_entity_to_linked_entities_map(self, context, sdd_context):
        '''
        '''
        extension = "csv"
        f = open(context.output_directory + os.sep + extension +
                 os.sep + "ldm_entity_related_entities" + '.' + extension,
                 "a",  encoding='utf-8')
        f.write("ldm_entity, related_entites\r")
        for elclass in context.ldm_entities_package.eClassifiers:
            if isinstance(elclass, ELClass):                 
                entities = ELDMSearch.get_all_related_entities(self, context, elclass)
                related_entities_string = ""
                first = True
                for entity in entities:
                    if not(first):
                        related_entities_string = related_entities_string + ":"
                    first = False
                    related_entities_string = related_entities_string + entity.name

                f.write(elclass.name + "," + related_entities_string + "\r")
                context.ldm_entity_to_linked_tables_map[elclass.name] = related_entities_string
        f.close()


    def add_table_parts(self, context, sdd_context, rules_for_report,
                        report_template, framework, cube_type):

        GenerationRuleCreator.add_table_parts_il(self, context, sdd_context,
                                                 rules_for_report,
                                                 report_template, framework,
                                                 cube_type) 
        

 

    def add_table_parts_il(self, context, sdd_context,
                            rules_for_report,report_template, 
                            framework,cube_type):
        '''
        For each report, check which main catagories are applicable 
        (e.g loans and advances)
        For each main catagory check what EIL tables are relevant
        (e.g. Instrument)
        For each of those tables create part of the generation transformation
        '''
        if framework == "FINREP_REF":
            tables_for_main_catagory_map = context.tables_for_main_catagory_map_finrep
            table_parts_to_linked_tables_map = context.table_parts_to_linked_tables_map_finrep
            table_and_part_tuple_map = context.table_and_part_tuple_map_finrep
        elif framework == "AE_REF":
            tables_for_main_catagory_map = context.tables_for_main_catagory_map_ae
            table_parts_to_linked_tables_map = context.table_parts_to_linked_tables_map_ae
            table_and_part_tuple_map = context.table_and_part_tuple_map_ae

        
        try:
            if cube_type == 'ELDM':
                report_template = report_template + "_REF_OutputItem"
            main_catagories = context.report_to_main_catogory_map[report_template]
            for mc in main_catagories:
                try:
                    tables = tables_for_main_catagory_map[mc]
                    for table in tables:
                
                        rules_for_table = RulesForILTable()
                        rules_for_table.inputLayerTable = GenerationRuleCreator.\
                                        find_input_layer_cube (self,context,table,framework,cube_type)
                        rules_for_report.rulesForTable.extend([rules_for_table])
                        table_parts = table_and_part_tuple_map[mc]

                        for table_part in table_parts:
                            input_entity_list = [rules_for_table.inputLayerTable]
                            # a table like instrument might have linked tables
                            # defined such as Party or Collateral
                            linked_tables = table_parts_to_linked_tables_map[table_part]
                            linked_tables_list = linked_tables.split(":")
                            if not (rules_for_table.inputLayerTable is None):
                                if not (rules_for_table.inputLayerTable.name in linked_tables_list):
                                    linked_tables_list.append(rules_for_table.inputLayerTable.name)
                            extra_tables = []
                            for the_table in linked_tables_list:
                                extra_linked_tables = []
                                try:
                                    if the_table.endswith("_ELDM"):
                                        extra_linked_tables_string = context.ldm_entity_to_linked_tables_map[the_table]
                                        extra_linked_tables = extra_linked_tables_string.split(":")
                                    else:
                                        extra_linked_tables_string = context.ldm_entity_to_linked_tables_map[the_table+"_ELDM"]
                                        extra_linked_tables = extra_linked_tables_string.split(":")
                                except KeyError:
                                    pass

                                for extra_table in extra_linked_tables:
                                    if not extra_table in linked_tables_list:
                                        extra_tables.append(extra_table)

                            for extra_table in extra_tables:
                                if extra_table.endswith("_ELDM"):
                                    extra_table = linked_tables_list.append(extra_table[0:len(extra_table)-5])
                                else:
                                    extra_table = linked_tables_list.append(extra_table)


                            for the_table in linked_tables_list:
                                
                                the_input_table  = GenerationRuleCreator.\
                                                    find_input_layer_cube (
                                                    self,context,the_table,framework,cube_type)
                                if not (the_input_table is None):
                                    input_entity_list.append(the_input_table)

                            if table_part[0] == table:
                                rules_for_il_table_part = RuleForILTablePart()
                                rules_for_il_table_part.main_catagory = mc
                                rules_for_il_table_part.name = table_part[1]
                                rules_for_il_table_part.table_and_part_tuple = table_part
                                rules_for_table.rulesForTablePart.append(rules_for_il_table_part)
                                GenerationRuleCreator.\
                                    add_field_to_field_lineage_to_rules_for_table_part(
                                                    self, context,sdd_context, rules_for_il_table_part,
                                                     rules_for_report.outputLayerCube,
                                                     input_entity_list,mc,report_template,
                                                     framework,cube_type)
                except KeyError:
                    print ("no tables for main catagory:" + mc)

        except KeyError:
                    print ("no main catagory for report :" + report_template)

    def add_field_to_field_lineage_to_rules_for_table_part(self, context,
                                                           sdd_context,
                                                           rules_for_il_table_part,
                                                           output_entity,
                                                           input_entity_list,
                                                           catagory,
                                                           report_template, 
                                                           framework,cube_type):
        '''
        Add field to field lineage entries to the rules for the table part
        '''
        if not output_entity is None:
            for output_item in output_entity.eOperations:
                
                if isinstance(output_item, ELOperation):
                    if GenerationRuleCreator.valid_operation(self,context, output_item,framework,cube_type,catagory,report_template):
                        if cube_type == 'ELDM':
                            input_columns = GenerationRuleCreator.\
                                find_variables_with_same_domain_then_name(
                                self,sdd_context,output_item,input_entity_list)
                        else:
                            input_columns = GenerationRuleCreator.\
                                find_related_variables( 
                                self,context,sdd_context,output_item,input_entity_list)

                        if len(input_columns) == 0:
                            select_column = SelectColumnAttributeAs()
                            select_column.asAttribute = output_item
                            rules_for_il_table_part.columns.extend([select_column])
                        else:                        
                            for input_column in input_columns:
                                select_column = SelectColumnAttributeAs()
                                select_column.asAttribute = output_item
                                select_column.attribute = input_column
                                rules_for_il_table_part.columns.extend([select_column])
                                
                                key= rules_for_il_table_part.name + ":" + rules_for_il_table_part.table_and_part_tuple[0] + ":" + output_item.name + "," + rules_for_il_table_part.name + "," + rules_for_il_table_part.table_and_part_tuple[0] + "," + output_item.name
                                try:
                                    values = context.table_part_varaible_transformation_map[key]
                                    values.append(input_column)
                                except KeyError:
                                    values = []
                                    values.append(input_column)
                                    context.table_part_varaible_transformation_map[key] = values

    
    def valid_operation(self,context, output_item,framework,cube_type,catagory,report_template):
        '''
        check if the operation is valid for the cube type
        '''
        if cube_type == 'ELDM':
            return True
            #return GenerationRuleCreator.operation_exists_in_cell_for_report_with_catagory(self,context, output_item,framework,cube_type,catagory,report_template)
        else:
            return True
        
    def operation_exists_in_cell_for_report_with_catagory(self,context, output_item,framework,input_cube_type,catagory,report_template):
        '''
        Check if the operation exists in the combination of the report and typ_instrmnt
        '''
        if framework == 'FINREP_REF':
            if input_cube_type == 'RC':
                reports_module = context.finrep_on_sdd_reports_module
            elif input_cube_type == 'EIL':
                reports_module = context.finrep_on_il_reports_module
            elif input_cube_type == 'ELDM':
                reports_module = context.finrep_on_ldm_reports_module

        elif framework == 'AE_REF':
            if input_cube_type == 'RC':
                reports_module = context.ae_on_sdd_reports_module
            elif input_cube_type == 'EIL':
                reports_module = context.ae_on_il_reports_module
            elif input_cube_type == 'ELDM':
                reports_module = context.ae_on_ldm_reports_module

        for report in reports_module.reports:
                if isinstance(report, CellBasedReport):
                    if report.outputLayer.name == report_template:
                        for cell in report.reportCells:
                            if cell in context.cell_to_typ_instrmnt_map[catagory]:
                                for filter in cell.filters:
                                    if filter.operation.name == output_item.name:
                                        for memeber_id in filter.member:
                                            if memeber_id.name == catagory:
                                                return True
        return False
        
    def find_related_variables(self,context,sdd_context,output_item,input_entity_list):
        '''
        when we have an ROL item it has a specific domain.
        We want to find any column in the limited related input tables
        which has the same domain
        '''
        output_variable_name = output_item.name
        related_variables = []
        if not (output_variable_name is None):
            for input_entity in input_entity_list:
                if not (input_entity is None):
                    for input_item in input_entity.eStructuralFeatures:
                        if isinstance(input_item, ELAttribute):
                            input_item_name = input_item.name
                            if input_item_name == output_variable_name:
                                related_variables= []
                                related_variables.append(input_item)
                            try:
                                primary_concept = sdd_context.\
                                    variable_to_primary_concept_map[input_item_name]
                                if primary_concept == output_variable_name:
                                    related_variables= []
                                    related_variables.append(input_item)
                            except KeyError:
                                pass
        return related_variables
    
    def find_variables_with_same_domain_then_name(self,sdd_context,output_item,input_entity_list):
        '''
        when we have an ROL item it has a specific domain.
        We want to find any column in the limited related input tables
        which has the same domain
        '''
        related_variables = []   
        target_domain = None
        etype = output_item.eType
        if isinstance(etype, ELEnum):
            target_domain = etype

        if not (target_domain is None):
            for input_entity in input_entity_list:
                if not (input_entity is None):
                    for input_item in input_entity.eStructuralFeatures:
                        if isinstance(input_item, ELAttribute):
                            input_item_etype = input_item.eAttributeType
                            if isinstance(etype, ELEnum):
                                if not (input_item_etype is None):
                                    if input_item_etype.name == target_domain.name:
                                        if not (input_item in related_variables):
                                            related_variables.append(input_item)
                                else:
                                    print("input_item_etype is None for " + input_item.name)
        else:
            output_variable_name = output_item.name
           
            if not (output_variable_name is None):
                for input_entity in input_entity_list:
                    if not (input_entity is None):
                        for input_item in input_entity.eStructuralFeatures:
                            if isinstance(input_item, ELAttribute):
                                input_item_name = input_item.name
                                if input_item_name == output_variable_name:
                                    if not (input_item in related_variables):
                                        related_variables.append(input_item)
                                else:
                                    try:
                                        primary_concept = sdd_context.\
                                            variable_to_primary_concept_map[input_item_name]
                                        if primary_concept == output_variable_name:
                                            if not (input_item in related_variables):
                                                related_variables.append(input_item)
                                    except KeyError:
                                        pass

        return related_variables
    
    def find_output_layer_cube(self, context, output_layer_name, framework, cube_type):
        '''
        Find the ELClass for the related output layer cube given the cube name
        '''
        if framework == 'FINREP_REF':
            package = context.finrep_output_tables_package
        elif framework == 'AE_REF':
            package = context.ae_output_tables_package  
            
        for classifier in package.eClassifiers:
            if isinstance(classifier, ELClass):
                if classifier.name == output_layer_name:
                    return classifier

    def find_input_layer_cube(self, context, input_layer_name, framework, cube_type):
        '''
        Find the ELClass for the related output layer cube given the cube name
        '''
        if cube_type == 'EIL':
            package = context.input_tables_package
        elif cube_type == 'ELDM':    
            package = context.ldm_entities_package  

        for classifier in package.eClassifiers:
            if isinstance(classifier, ELClass):
                input_layer_name_to_compare = None
                if not(context.input_layer_code_has_EIL_postfix):
                    input_layer_name_to_compare = input_layer_name + "_" + cube_type
                else:
                    input_layer_name_to_compare = input_layer_name 

                if classifier.name == input_layer_name_to_compare:
                    return classifier
