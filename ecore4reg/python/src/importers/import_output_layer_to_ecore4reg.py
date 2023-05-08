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

'''
Created on 22 Jan 2022

@author: Neil
'''
import os
import csv
from importers.utils import Utils
from ecore4reg import ELClass, ELEnum, ELEnumLiteral, ELOperation, ELReference

class ROLImport(object):
    '''
    Documentation for ROLImport
    '''

    def doImport(self, context):
        '''
        import the items from the Output layer csv files
        '''
        ROLImport.add_rol_classes_to_package(self, context)
        ROLImport.create_variable_set_to_variable_map(self, context)
        ROLImport.create_variable_to_domain_map(self, context)
        ROLImport.create_domain_to_domain_name_map(self, context)
        ROLImport.create_member_maps(self, context)
        if context.use_subdomains:
            ROLImport.create_subdomain_to_domain_map(self, context)
            ROLImport.create_subdomain_to_member_maps(self, context)
            ROLImport.add_rol_enums_and_literals_to_package_using_subdomains(
                self, context)
        else:
            ROLImport.add_rol_enums_and_literals_to_package(self, context)
        ROLImport.add_rol_attributes_to_classes(self, context)

    def add_rol_classes_to_package(self, context):
        '''
        Add the ROL classes to the package
        '''
        file_location = context.file_directory + os.sep + "cube.csv"
        header_skipped = False
        # Load all the entities from the csv file, make an ELClass per entity,
        # and add the ELClass to the package
        with open(file_location,  encoding='utf-8') as csvfile:
            filereader = csv.reader(csvfile, delimiter=',', quotechar='"')
            for row in filereader:
                # skip the first line which is the header.
                if not header_skipped:
                    header_skipped = True
                else:

                    class_name = row[0]
                    altered_class_name = Utils.make_valid_id(class_name)
                    object_id = row[1]
                    cube_type = row[3]
                    valid_to = row[11]
                    framework = row[5]


                    if ((framework == "FINREP_REF") and (cube_type == "RC") and ((valid_to == "12/31/9999") or (valid_to == "31/12/9999"))):

                        altered_class_name = Utils.make_valid_id(class_name)

                        eclass = ELClass(name=altered_class_name+"_OutputItem")

                        eclass_table = ELClass(
                            name=altered_class_name+"_OutputTable")
                        eclass_table.containedEntityType = eclass
                        containment_reference = ELReference()
                        containment_reference.name = eclass.name+"s"
                        containment_reference.eType = eclass
                        containment_reference.upperBound = -1
                        containment_reference.lowerBound = 0
                        containment_reference.containment = True
                        eclass_table.eStructuralFeatures.append(
                            containment_reference)
                        xclass_table_peration = ELOperation()
                        xclass_table_peration.name = eclass.name+"s"
                        xclass_table_peration.eType = eclass
                        xclass_table_peration.upperBound = -1
                        xclass_table_peration.lowerBound = 0

                        eclass_table.eOperations.append(xclass_table_peration)

                        context.output_layer_entities_package.eClassifiers.extend([
                                                                               eclass])
                        context.output_layer_entities_package.eClassifiers.extend([
                                                                               eclass_table])

                        # maintain a map a objectIDs to ELClasses
                        context.classes_map[object_id] = eclass
                        context.table_map[eclass] = eclass_table

    def create_variable_set_to_variable_map(self, context):
        '''
        Create a map of variable sets to variables
        '''

        # Make a variable to Domain Map
        file_location = context.file_directory + os.sep + "variable_set_enumeration.csv"
        header_skipped = False
        # or each attribute add an Xattribute to the correct ELClass represtnting the Entity
        # the attribute should have the correct type, which may be a specific
        # enumeration

        with open(file_location,  encoding='utf-8') as csvfile:
            filereader = csv.reader(csvfile, delimiter=',', quotechar='"')
            for row in filereader:
                if not header_skipped:
                    header_skipped = True
                else:
                    valid_to = row[4]
                    variable_id = row[5]
                    variable_set = row[6]

                    if (valid_to == "12/31/9999") or (valid_to == "12/31/2999") or (valid_to == "31/12/9999") or (valid_to == "31/12/2999"):
                        variable_list = None
                        try:
                            variable_list = context.variable_set_to_variable_map[variable_set]
                        except:
                            variable_list = []
                            context.variable_set_to_variable_map[variable_set] = variable_list

                        if not variable_id in variable_list:
                            variable_list.append(variable_id)

    def create_variable_to_domain_map(self, context):
        '''
        Create a map of variables to domains
        '''

        # Make a variable to Domain Map
        file_location = context.file_directory + os.sep + "variable.csv"
        header_skipped = False
        # or each attribute add an Xattribute to the correct ELClass represtnting the Entity
        # the attribute should have the correct type, which may be a specific
        # enumeration

        with open(file_location,  encoding='utf-8') as csvfile:
            filereader = csv.reader(csvfile, delimiter=',', quotechar='"')
            for row in filereader:
                if not header_skipped:
                    header_skipped = True
                else:
                    variable_name = row[6]
                    long_name = row[4]
                    # domainName = Utils.make_valid_id(row[3])
                    domain = row[2]
                    context.variable_to_domain_map[variable_name] = domain
                    context.variable_to_long_names_map[variable_name] = long_name

    def create_domain_to_domain_name_map(self, context):
        '''
         Make a domain  to Domain Name Map
        '''
        file_location = context.file_directory + os.sep + "domain.csv"
        header_skipped = False

        with open(file_location,  encoding='utf-8') as csvfile:
            filereader = csv.reader(csvfile, delimiter=',', quotechar='"')
            for row in filereader:
                if not header_skipped:
                    header_skipped = True
                else:
                    domain_id = row[0]
                    # domainName = Utils.make_valid_id(row[3])
                    domain_name = row[8]
                    context.domain_to_domain_name_map[domain_id] = domain_name

    def create_member_maps(self, context):
        '''
            Make a domain  to Domain Name Map
        '''
        # Make a domain  to Domain Name Map
        file_location = context.file_directory + os.sep + "member.csv"
        header_skipped = False

        with open(file_location,  encoding='utf-8') as csvfile:
            filereader = csv.reader(csvfile, delimiter=',', quotechar='"')
            for row in filereader:
                if not header_skipped:
                    header_skipped = True
                else:
                    member_id = row[4]
                    # domainName = Utils.make_valid_id(row[3])
                    member_code = row[0]
                    member_name = row[5]
                    if (member_name is None) or (member_name == ""):
                        member_name = member_id
                    domain_id = row[2]

                    # if there is no domain ID this suggests a faulty 
                    # row in the csv due to return statements in fields
                    if not (domain_id is None) and not (domain_id == ""):
                        context.member_id_to_domain_map[member_id] = domain_id
                        context.member_id_to_member_name_map[member_id] = member_name
                        context.member_id_to_member_code_map[member_id] = member_code

    def create_subdomain_to_domain_map(self, context):
        '''
            Make a domain  to Domain Name Map
        '''
        file_location = context.file_directory + os.sep + "subdomain.csv"
        header_skipped = False
        # for each subdomain createw a lsit

        with open(file_location,  encoding='utf-8') as csvfile:
            filereader = csv.reader(csvfile, delimiter=',', quotechar='"')
            for row in filereader:
                if not header_skipped:
                    header_skipped = True
                else:
                    domain_id = row[2]
                    subdomain_id = row[8]
                    context.subdomain_id_to_domain_id[subdomain_id] = domain_id

    def create_subdomain_to_member_maps(self, context):
        '''
            Make a domain  to Domain Name Map
        '''
        file_location = context.file_directory + os.sep + "subdomain_enumeration.csv"
        header_skipped = False
        # for each subdomain createw a lsit

        with open(file_location,  encoding='utf-8') as csvfile:
            filereader = csv.reader(csvfile, delimiter=',', quotechar='"')
            for row in filereader:
                if not header_skipped:
                    header_skipped = True
                else:
                    member_id = row[0]
                    subdomain_id = row[2]
                    valid_to = row[4]
                    if (valid_to == "12/31/9999") or (valid_to == "12/31/2999") or (valid_to == "31/12/9999") or (valid_to == "31/12/2999"):
                        member_list = None
                        try:
                            member_list = context.subdomain_to_member_list_map[subdomain_id]
                        except:
                            member_list = []
                            context.subdomain_to_member_list_map[subdomain_id] = member_list

                        if not member_id in member_list:
                            member_list.append(member_id)

    def add_rol_enums_and_literals_to_package(self, context):
        '''
        Add the ROLEnums and Literals to the package
        '''

        file_location = context.file_directory + os.sep + "cube_structure_item.csv"
        header_skipped = False
        # or each attribute add an Xattribute to the correct ELClass represtnting the Entity
        # the attribute should have the correct type, which may be a specific
        # enumeration

        with open(file_location,  encoding='utf-8') as csvfile:
            filereader = csv.reader(csvfile, delimiter=',', quotechar='"')
            for row in filereader:
                if not header_skipped:
                    header_skipped = True
                else:

                    variable = row[2]
                    classID = row[1]
                    variableSet = row[12]

                    try: 
                        the_class = context.classes_map[classID]
                        attributeList = [variable]
                        if (variable=="MTRCS"):
                            attributeList = context.variable_set_to_variable_map[variableSet]
                        if (variable == "VALUE_DECIMAL") or (variable == "OBSERVATION_VALUE"):
                            attributeList = []
                            
                        for attribute_name in attributeList:
                            try: 

                                domain_id = context.variable_to_domain_map[attribute_name]
                                # domain_ID_Name = context.domain_to_domain_name_map[domainID]
                                amended_domain_name = Utils.make_valid_id(domain_id)
                                the_enum = Utils.find_rol_enum(
                                    amended_domain_name+"_domain", context.enum_map)
                                if the_enum is None:
                                    if not domain_id in context.missing_domains:
                                        context.missing_domains.append(domain_id)
                            except:
                                print("missing ROL class2: ")
                                print(classID)
                    except:
                                print( "missing ROL class2: " )
                                print(classID)

        for the_domain in context.missing_domains:

            # domain_ID_Name = context.domain_to_domain_name_map[theDomain]
            amended_domain_name = Utils.make_valid_id(the_domain) + "_domain"
            if not ((amended_domain_name == "String") or (amended_domain_name == "Date")):
                the_enum = ELEnum()
                the_enum.name = amended_domain_name
                # maintain a map of enum IDS to ELEnum objects
                context.enum_map[amended_domain_name] = the_enum
                context.output_layer_enums_package.eClassifiers.extend([the_enum])
                the_domain_members = Utils.get_members_of_the_domain(
                    the_domain, context.member_id_to_domain_map)
                counter1 = 0
                for member in the_domain_members:
                    enum_literal = ELEnumLiteral()
                    enum_used_name = Utils.make_valid_id(
                        context.member_id_to_member_code_map[member])
                    adapted_value = Utils.make_valid_id(
                        context.member_id_to_member_name_map[member])
                    new_adapted_value = Utils.unique_value(the_enum, adapted_value)
                    new_adapted_name = Utils.unique_name(the_enum, enum_used_name)

                    enum_literal.name = new_adapted_value
                    enum_literal.literal = new_adapted_name
                    counter1 = counter1 + 1
                    enum_literal.value = counter1
                    the_enum.eLiterals.extend([enum_literal])

    def add_rol_enums_and_literals_to_package_using_subdomains(self, context):
        '''
        Add the ROLEnums and Literals to the package
        '''
        file_location = context.file_directory + os.sep + "cube_structure_item.csv"
        header_skipped = False
        # or each attribute add an Xattribute to the correct ELClass represtnting the Entity
        # the attribute should have the correct type, which may be a specific
        # enumeration

        with open(file_location,  encoding='utf-8') as csvfile:
            filereader = csv.reader(csvfile, delimiter=',', quotechar='"')
            for row in filereader:
                if (not header_skipped):
                        header_skipped = True
                else:
                    
                    variable = row[2]
                    subdomain_id = row[10 ]
                    class_id = row[1]
                    specific_member = row[7 ]
                    variable_set = row[12]
                    try:
                        cube_name = context.classes_map[class_id]
                        attribute_list = [variable]
                        if (variable=="MTRCS"):
                            attribute_list = context.variable_set_to_variable_map[variable_set]
                        if (variable == "VALUE_DECIMAL") or (variable == "OBSERVATION_VALUE"):
                            attribute_list = []
                            
                        for attribute_name in attribute_list:
                        
                            domain_id = None
                            # deal with the case where we have no subdomain but have a specific member
                            if (variable=="MTRCS"):
                                domain_id = context.variable_to_domain_map[attribute_name]
                                amended_domain_name = domain_id
                            elif ((subdomain_id == "") or (subdomain_id == None)) and (len(specific_member) > 0):
                                domain_id = context.variable_to_domain_map[attribute_name]
                                # where is domain_ID_Name defined? is this a bug
                                if (domain_ID_Name == "Date") or (domain_ID_Name == "String"):
                                    amended_domain_name = domain_ID_Name
                                else:
                                    amended_domain_name = Utils.make_valid_id(subdomain_id + "_ISMEMBER_" + specific_member)
                            else:
                                domain_id = context.subdomain_id_to_domain_id[subdomain_id]
                                domain_ID_Name = context.domain_to_domain_name_map[domain_id]
                                if (domain_ID_Name == "Date") or (domain_ID_Name == "String"):
                                    amended_domain_name = domain_ID_Name
                                else:
                                    amended_domain_name = Utils.make_valid_id(subdomain_id + "_ISSUBDOMAINOF_" + domain_ID_Name)
                                 
                            try: 
        
                                the_enum =  Utils.find_rol_enum(amended_domain_name,context.enum_map)
                                if the_enum is None:
                                    if not( (amended_domain_name == "String") or (amended_domain_name == "Date")  ):
                                        the_enum = ELEnum()
                                        the_enum.name = amended_domain_name 
                                        #maintain a map of enum IDS to XEnum objects
                                        context.enum_map[amended_domain_name] = the_enum
                                        context.output_layer_enums_package.eClassifiers.extend([the_enum])
                                        the_domain_members= None
                                        if (variable=="MTRCS"):
                                            the_domain_members=[]
                                        elif ((subdomain_id == "") or (subdomain_id == None)) and (len(specific_member) > 0):
                                            the_domain_members=[specific_member]
                                        else:
                                            the_domain_members= context.subdomain_to_member_list_map[subdomain_id]
                                        counter1 = 0
                                        for member in the_domain_members:
                                            enum_literal = ELEnumLiteral()
                                            enum_used_name = Utils.make_valid_id(context.member_id_to_member_code_map[member])
                                            adapted_value = Utils.make_valid_id(context.member_id_to_member_name_map[member])
                                            new_adapted_value = Utils.unique_value( the_enum, adapted_value)
                                            new_adapted_name = Utils.unique_name( the_enum, enum_used_name)
                        
                                            enum_literal.name =  new_adapted_value
                                            enum_literal.literal = new_adapted_name
                                            counter1 = counter1 + 1
                                            enum_literal.value = counter1
                                            the_enum.eLiterals.extend([enum_literal]) 
                                    else:
                                        the_enum = ELEnum()
                                        the_enum.name = amended_domain_name 
                                        context.enum_map[amended_domain_name] = the_enum
                                          
                                    
                            except:
                                    print( "missing ROL class2: " )
                                    print(class_id)
                    except:
                                print( "class not in list: " )
                                print(class_id)    
                            
    def add_rol_attributes_to_classes(self, context):
        '''
        For each attribute add an Xattribute to the correct ELClass represtnting the Entity
        the attribute should have the correct type, which may be a specific
        enumeration
        '''
        file_location = context.file_directory + os.sep + "cube_structure_item.csv"
        header_skipped = False

        with open(file_location,  encoding='utf-8') as csvfile:
            filereader = csv.reader(csvfile, delimiter=',', quotechar='"')
            for row in filereader:
                if not header_skipped:
                        header_skipped = True
                else:
                    the_attribute_name1 = row[11 ]
                    long_name=None
                    
                    variable = row[2 ]
                    subdomain_id = row[10 ]
                    class_id = row[1 ]
                    specific_member = row[7 ]
                    variable_set = row[12]
                    
                    try:
                        the_class = context.classes_map[class_id]
                        attribute_list = [the_attribute_name1]
                        if (the_attribute_name1=="MTRCS"):
                            attribute_list = context.variable_set_to_variable_map[variable_set]
                        if (the_attribute_name1 == "VALUE_DECIMAL") or (the_attribute_name1 == "OBSERVATION_VALUE"):
                            attribute_list = []
                        for attribute_name in attribute_list: 
                        
                            try: 
                                try:
                                    long_name = context.variable_to_long_names_map[attribute_name]
                                except:
                                    long_name = attribute_name
                                amended_attribute_name = Utils.make_valid_id(attribute_name)
                                amended_attribute_long_name = Utils.make_valid_id(long_name)
                                
                                the_class = context.classes_map[class_id]
                                
                                class_is_derived = True
                                
                                if(context.use_variable_long_name):   
                                    the_attribute_name = amended_attribute_long_name 
                                else:
                                    the_attribute_name = amended_attribute_name
                                
                                amended_domain_name = None
                                if (the_attribute_name1=="MTRCS"):
                                    if context.use_subdomains:
                                        domain_id = context.variable_to_domain_map[attribute_name]
                                        amended_domain_name = Utils.make_valid_id(domain_id)
                                    else:
                                        domain_id = context.variable_to_domain_map[attribute_name]
                                        amended_domain_name = Utils.make_valid_id(domain_id+"_domain")
                                else:   
                                    if context.use_subdomains:
                                        if ((subdomain_id == "") or (subdomain_id == None)) and (len(specific_member) > 0):
                                            domain_id = context.variable_to_domain_map[variable]
                                            if (domain_ID_Name == "Date") or (domain_ID_Name == "String"):
                                                amended_domain_name = domain_ID_Name
                                            else:
                                                amended_domain_name = Utils.make_valid_id(subdomain_id + "_ISMEMBER_" + specific_member)
                    
                                        else:
                                            domain_id = context.subdomain_id_to_domain_id[subdomain_id]
                                            domain_ID_Name = context.domain_to_domain_name_map[domain_id]
                                            if (domain_ID_Name == "Date") or (domain_ID_Name == "String"):
                                                amended_domain_name = domain_ID_Name
                                            else:
                                                amended_domain_name = Utils.make_valid_id(subdomain_id + "_ISSUBDOMAINOF_" + domain_ID_Name)
                                             
                                    else:
                                        domain_id = context.variable_to_domain_map[variable]
                                        amended_domain_name = Utils.make_valid_id(domain_id+"_domain")
                                #domain_ID_Name = context.domain_to_domain_name_map[domainID]
                              
                                the_enum =  Utils.find_rol_enum(amended_domain_name,context.enum_map)
                                if  the_enum is not None:                     
                                    
                                    if class_is_derived:
                                        operation = ELOperation()
                                        operation.lowerBound=0
                                        operation.upperBound=1
                                        if(the_enum.name == "String"):
                                            operation.name = the_attribute_name
                                            operation.eType = context.e_string
                                        elif(the_enum.name == "Date"):
                                            operation.name = the_attribute_name
                                            operation.eType = context.e_date
                                        elif(the_enum.name.startswith("String_")):
                                            operation.name = the_attribute_name
                                            operation.eType = context.e_string
                                        elif(the_enum.name == "STRNG_domain"):
                                                operation.name = the_attribute_name
                                                operation.eType = context.e_string
                                        elif(the_enum.name == "EBA_String_domain"):
                                                operation.name = the_attribute_name
                                                operation.eType = context.e_string
                                        elif(the_enum.name == "DT_domain"):
                                                operation.name = the_attribute_name
                                                operation.eType = context.e_date
                                        elif(the_enum.name == "Number"):
                                            operation.name = the_attribute_name
                                            operation.eType = context.e_double
                                        
                                        elif(the_enum.name.startswith("Real_")):
                                            operation.name = the_attribute_name
                                            operation.eType = context.e_double
                                        elif(the_enum.name.startswith("Monetary")): 
                                            operation.name = the_attribute_name
                                            operation.eType = context.e_int
                                        elif(the_enum.name.startswith("MNTRY")): 
                                            operation.name = the_attribute_name
                                            operation.eType = context.e_int
                                        elif(the_enum.name.startswith("Monetary_domain")): 
                                            operation.name = the_attribute_name
                                            operation.eType = context.e_int
                                        elif(the_enum.name.startswith("Non_negative_monetary_amounts_with_2_decimals")): 
                                            operation.name = the_attribute_name
                                            operation.eType = context.e_int
                                        elif(the_enum.name.startswith("Non_negative_integers")): 
                                            operation.name = the_attribute_name
                                            operation.eType = context.e_int
                                        elif(the_enum.name.startswith("All_possible_dates")):   
                                            operation.name = the_attribute_name
                                            operation.eType = context.e_date  
                                        else:
                                            operation.name = the_attribute_name
                                            operation.eType = the_enum  
                                        
                                    try:
                                        the_class = context.classes_map[class_id]
                                        
                                        if class_is_derived:
                                            the_class.eOperations.extend([operation])
                                    except:
                                        print( "missing class2: " )

                                else:
                                    print( "XXXXX missing domainID: " )
                                    print(domain_id)
                                    print(class_id)
                                    if not(domain_id in context.missing_domains):
                                        context.missing_domains.append(domain_id)
                            except:
                                    print( "XX missing ROL class1: " )
                                    print(class_id) 
                    except:
                        print("XX missing ROL class1: ")
                        print(class_id)