# coding=UTF-8#
# Copyright (c) 2020 Bird Software Solutions Ltd
# This program and the accompanying materials
# are made available under the terms of the Eclipse Public License 2.0
# which accompanies this distribution, and is available at
# https://www.eclipse.org/legal/epl-2.0/
#
# SPDX-License-Identifier: EPL-2.0
#
# Contributors:
#    Neil Mackenzie - initial API and implementation
#

from pyecore.ecore import EPackage
from sdd_model import *
from pyecore.resources import ResourceSet, URI
import os

class SDDContext(object):
    '''
    Documentation for Context
    '''
    # variables to configure the behaviour

    use_codes = True
    
    # the directory where we get our input files
    file_directory = ""
    # the directory where we save our outputs.
    output_directory = ""

    # The domains
    domains = DomainModule(name = 'domainsModule')
    #The variables
    variables = VariableModule(name = 'variablesModule')
    #The variable sets
    variable_sets = VariableSetModule(name = 'variablesModule')
    #The members
    members = MemberModule(name = 'memberModule')
    #The subdomains
    subdomains = SubDomainModule(name = 'subdomainsModule')
    #The maintenance_agencies
    maintenance_agencies = MaintenanceAgencyModule(name = 'maintenanceAgencyModule')
    #The Frameworks
    frameworks = FrameworkModule(name = 'frameworks')
    #The combinations
    combinations = CombinationModule(name = 'combinationsModule')
    #The cubesModule
    cubes = CubeModule(name = 'cubesModule')
    #The cubeStructuresModule
    cube_structures = CubeModule(name = 'cubeStructuresModule')
    #The cubeStructureItemsModule
    cube_structure_items= CubeModule(name = 'cubeStructureItemsModule')
    #The cubeMappingModule
    cube_mappings = CubeMappingModule(name = 'cubeMappingModule')
    #The mappingDefinitionModule
    mapping_definitions = MappingDefinitionModule(name = 'mappingDefinitionModule')
    #The memberMappingModule
    member_mappings = MemberMappingModule(name = 'memberMappingModule')
    #The memberHierarchyModule
    member_hierarchies = MemberHierarchyModule(name = 'memberHierarchyModule')
    #The variableMappingModule
    variable_mappings = VariableMappingModule(name = 'variableMappingModule')
    #The variableMappingModule
    report_tables = ReportTableModule(name = 'reportTableModule')
    #The TableCellModule
    table_cells = TableCellModule(name = 'tableCellModule')
    #The AxisModule
    axes = AxisModule (name = 'axisModule')
    #the AxisOrdinateModule
    axis_ordinates = AxisOrdinateModule (name = 'axisOrdinateModule')
    # the CellPositionModule
    cell_positions = CellPositionModule(name = 'cellPositionModule')
    #The core sdd model
    core_sdd_model = SMCubesCoreModel(name = 'smcubesCoreModel')
    #The extra sdd model
    extra_sdd_model = SMCubesExtraModel(name = 'smcubesExtraModel')
    
    sdd_model = SMCubesModel(name = 'smcubesModel') 

    members_that_are_nodes = []
    member_plus_hierarchy_to_child_literals = {}
    domain_to_hierarchy_dictionary = {}
    combinations_dictionary = {}
    member_dictionary = {}
    domain_dictionary = {}
    subdomain_dictionary = {}
    member_hierarchy_dictionary = {}
    member_hierarchy_node_dictionary = {}
    cube_structure_dictionary = {}
    cube_dictionary = {}
    variable_dictionary= {}
    axis_ordinate_dictionary= {}
    table_cell_dictionary= {}
    table_to_table_cell_dictionary= {}
    member_mapping_dictionary = {}
    cell_positions_dictionary = {}
    variable_set_enumeration_dictionary = {}
    # For the reference output layers we record a map between variables
    # and domains
    variable_to_domain_map = {}
    variable_to_long_names_map = {}
    variable_to_primary_concept_map = {}

    combination_to_typ_instrmnt_map = {}
    table_to_combination_dictionary = {}

    # For the reference output layers we record a map between domains
    # and domain names
    domain_to_domain_name_map = {}
    
     # For the reference output layers we record a map between members ids
    # andtheir containing domains
    member_id_to_domain_map = {}
    # For the reference output layers we record a map between members ids
    # and their names
    member_id_to_member_name_map = {}
    # For the reference output layers we record a map between members ids
    # and their codes
    member_id_to_member_code_map = {}
    
    variable_set_to_variable_map = {}

    def import_sddmodel_from_xmi_file(self, context,sdd_context):
        # The domains
        self.domains = None
        #The variables
        self.variables = None
        #The variable sets
        self.variable_sets = None
        #The members
        self.members = None
        #The subdomains
        self.subdomains = None
        #The maintenance_agencies
        self.maintenance_agencies = None
        #The Frameworks
        self.frameworks = None
        #The combinations
        self.combinations = None
        #The cubesModule
        self.cubes = None
        #The cubeStructuresModule
        self.cube_structures = None
        #The cubeStructureItemsModule
        self.cube_structure_items= None
        #The cubeMappingModule
        self.cube_mappings = None
        #The mappingDefinitionModule
        self.mapping_definitions = None
        #The memberMappingModule
        self.member_mappings = None
        #The memberHierarchyModule
        self.member_hierarchies = None
        #The variableMappingModule
        self.variable_mappings = None
        #The variableMappingModule
        self.report_tables = None
        #The TableCellModule
        self.table_cells = None
        #The AxisModule
        self.axes = None
        #the AxisOrdinateModule
        self.axis_ordinates = None
        # the CellPositionModule
        self.cell_positions = None
        #The core sdd model
        self.core_sdd_model = None
        #The extra sdd model
        self.extra_sdd_model = None
        
        self.sdd_model = None 

        rset = ResourceSet()
        resource = rset.get_resource(URI('C:\\Users\\neil\\freebirdtools-develop-July11\\git\\efbt\\bird\\sdd_model\\sdd_model.ecore'))

        mm_root = resource.contents[0]

        rset.metamodel_registry[mm_root.nsURI] = mm_root
        extension = 'xmi'
        sdd_model_resource = rset.get_resource(URI(
            sdd_context.output_directory + os.sep + extension +
            os.sep + "sdd.xmi"))
        
        self.sdd_model = sdd_model_resource.contents[0]

        self.core_sdd_model = self.sdd_model.coreModel
        self.extra_sdd_model = self.sdd_model.extraModel
        self.report_tables = self.extra_sdd_model.reportTableModules[0]
        self.table_cells = self.extra_sdd_model.tableCellModules[0]
        self.axis_ordinates= self.extra_sdd_model.axisOrdinateModules[0]
        self.cell_positions = self.extra_sdd_model.cellPositionModules[0]
        self.member_mappings = self.extra_sdd_model.memberMappingModules[0]
        self.axes = self.extra_sdd_model.axisModules[0]
        self.combinations = self.extra_sdd_model.combinationModules[0]
        self.cubes = self.extra_sdd_model.cubeModules[0]
        self.frameworks = self.extra_sdd_model.frameworkModules[0]
        self.maintenance_agencies = self.core_sdd_model.maintenanceAgencyModules[0]
        self.members = self.core_sdd_model.memberModules[0]
        self.domains = self.core_sdd_model.domainModules[0]
        self.variables = self.core_sdd_model.variableModules[0]
        self.variable_sets = self.core_sdd_model.variableSetModules[0]
        self.member_hierarchies = self.core_sdd_model.memberHierarchyModules[0]
        self.subdomains = self.core_sdd_model.subDomainModules[0]

        # recreate dictionaries

        for domain in self.domains.domains:
            self.domain_dictionary[domain.id] = domain
            self.domain_to_domain_name_map[domain.id] = domain.name

        for member in self.members.members: 
            self.member_dictionary[member.id] = member
            self.member_id_to_domain_map[member.id] = member.domain
            self.member_id_to_member_name_map[member.id] = member.name
            self.member_id_to_member_code_map[member.id] = member.code

        for subdomain in self.subdomains.subDomains:
            self.subdomain_dictionary[subdomain.id] = subdomain

        for member_hierarchy in self.member_hierarchies.memberHierarchies:
            self.member_hierarchy_dictionary[member_hierarchy.id] = member_hierarchy
            for node in member_hierarchy.nodes:
                self.member_hierarchy_node_dictionary[node.id] = node
                self.members_that_are_nodes.append(node.member) 

        for combination in self.combinations.combinations:
            self.combinations_dictionary[combination.id] = combination

        for cube in self.cubes.cubes:
            self.cube_dictionary[cube.id] = cube

        for framework in self.frameworks.frameworks:
            self.framework_dictionary[framework.id] = framework

        for member_mapping in self.member_mappings.memberMappings:
            self.member_mapping_dictionary[member_mapping.id] = member_mapping

        for axis_ordinate in self.axis_ordinates.axisOrdinates:
            self.axis_ordinate_dictionary[axis_ordinate.id] = axis_ordinate

        for table_cell in self.table_cells.tableCells:
            self.table_cell_dictionary[table_cell.id] = table_cell
            self.table_to_table_cell_dictionary[table_cell.table.id] = table_cell

        for cell_position in self.cell_positions.cellPositions:
            self.cell_positions_dictionary[cell_position.id] = cell_position

        for variable_set in self.variable_sets.variableSets:
            self.variable_set_enumeration_dictionary[variable_set.id] = variable_set

        for variable in self.variables.variables:
            self.variable_dictionary[variable.id] = variable
            self.variable_to_domain_map[variable.id] = variable.domain
            self.variable_to_long_names_map[variable.id] = variable.longName
            self.variable_to_primary_concept_map[variable.id] = variable.primaryConcept

        for combination in self.combinations.combinations:
            self.combination_to_typ_instrmnt_map[combination.id] = combination.typInstrmnt

        for table in self.report_tables.reportTables:
            self.table_to_combination_dictionary[table.id] = table.combination

        for variable_set in self.variable_sets.variableSets:
            for variable in variable_set.variables:
                self.variable_set_to_variable_map[variable_set.id] = variable

        

    def __init__(self):

        self.core_sdd_model.variableModules.append(self.variables)
        self.core_sdd_model.variableSetModules.append(self.variable_sets)
        self.core_sdd_model.domainModules.append(self.domains)
        self.core_sdd_model.memberModules.append(self.members)
        self.core_sdd_model.subDomainModules.append(self.subdomains)
        self.core_sdd_model.maintenanceAgencyModules.append(self.maintenance_agencies)
        self.core_sdd_model.memberHierarchyModules.append(self.member_hierarchies)
        self.extra_sdd_model.frameworkModules.append(self.frameworks)        
        self.extra_sdd_model.cubeModules.append(self.cubes)
        self.extra_sdd_model.combinationModules.append(self.combinations)
        self.extra_sdd_model.memberMappingModules.append(self.member_mappings)
        self.extra_sdd_model.axisModules.append(self.axes)
        self.extra_sdd_model.axisOrdinateModules.append(self.axis_ordinates)
        self.extra_sdd_model.cellPositionModules.append(self.cell_positions)
        #self.extra_sdd_model.ordinateItemsModules.append(self.ordinate_items)
        self.extra_sdd_model.reportTableModules.append(self.report_tables)
        self.extra_sdd_model.tableCellModules.append(self.table_cells)
        self.sdd_model.coreModel=self.core_sdd_model
        self.sdd_model.extraModel=self.extra_sdd_model
