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
# This script creates an analysis model from an SDD file and saves it as a CSV filegit add 

from context.sdd_context import SDDContext
from importers.import_sdd_to_analysis_model import ImportSDD
from persister.persist_to_file import PersistToFile

if __name__ == '__main__':
    sdd_context = SDDContext()
    sdd_context.file_directory = 'C:\\Users\\LENOVO\\git\\efbt_the_directories2\\bird\\birdseed_creator\\resources'
    sdd_context.output_directory = 'C:\\Users\\LENOVO\\git\\efbt_the_directories2\\bird\\birdseed_creator\\results'
    ImportSDD().import_sdd(sdd_context)
    persister =SDDImport()
    persister.save_model_as_xmi_file()
    persister.save_analysis_model_as_csv(sdd_context)