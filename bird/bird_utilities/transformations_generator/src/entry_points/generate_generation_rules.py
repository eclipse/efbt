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
from context.context import Context
from importers.import_sdd_to_ecore4reg import SDDImport
from persister.persist_to_file import PersistToFile
from utils.ecore4reg_to_ecore_converter import Ecore4regToEcoreConverter
from generation_rules.main_catagory_finder import MainCatagoryFinder
from generation_rules.generation_rule_creator import GenerationRuleCreator
from utils.relationship_enricher import RelationshipEnricher

if __name__ == '__main__':
    context = Context()
    context.reporting_framework = "FINREP"
    context.reporting_framework_version = ["3","3.0-Ind"]
    # we will create an ecore4reg representation of BIRD also
    # to allow rapid what=-if changes to the model and instant 
    # validation of generation rules
    context.persist_to_ecore4reg = True
    context.use_subdomains = False
    # we are getting the information about EIL from the website information
    # and not from the SQLDeveloper files
    context.load_eil_from_website  = True

    # use codes not long names for columns
    context.use_codes = True
    # when finding  source columns form the input layer, related
    # to items in the output layer we find columns with matching
    # variables not matching domains

    context.find_variable_with_same_domain = False
    context.file_directory = '/workspaces/efbt/ecore4reg/python/resources'
    context.output_directory = '/workspaces/efbt/ecore4reg/python/results'
    # import the information about EIL and ROL from csv files downloaded
    # from the website.
    SDDImport().do_import(context)

    RelationshipEnricher().enrich(context)
    # create ecore representation to allow use of multiple exsitng ecore tools
    # frameworks and libraries
    Ecore4regToEcoreConverter().convert_packages_in_context(context)
    # find the main catagories related with reports.
    MainCatagoryFinder().create_report_to_main_catogory_maps(context)
    # create the generation rules
    GenerationRuleCreator().generate_generation_rules(context)
    # save the generated  files in useful formats
    persister = PersistToFile()

    persister.save_model_as_ecore_file(context)
    persister.save_model_as_xcore_file(context)
    persister.save_model_as_ecore4reg_file(context)
    persister.save_model_as_json_files(context)