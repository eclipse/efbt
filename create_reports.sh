#!/bin/bash

# clear results script
export PYTHONPATH="/workspaces/efbt/bird/birdseed_creator/src:/workspaces/efbt/bird/regdna_python_model:/workspaces/efbt/bird/sdd_python_model"
rm -rf bird/birdseed_creator/results/generations_transformations_csv/*
rm  bird/birdseed_creator/results/regdna/*.regdna
rm -rf bird/birdseed_creator/results/csv/*
rm -rf bird/birdseed_creator/results/xmi/*
rm -rf bird/birdseed_creator/results/regdna/ae_report_il/*
rm -rf bird/birdseed_creator/results/regdna/ae_report_ldm/*
rm -rf bird/birdseed_creator/results/regdna/ae_report_sdd/*
rm -rf bird/birdseed_creator/results/regdna/finrep_report_il/*
rm -rf bird/birdseed_creator/results/regdna/finrep_report_ldm/*
rm -rf bird/birdseed_creator/results/regdna/finrep_report_sdd/*

cd bird/birdseed_creator/src/entry_points
pip install pyecore
pip install unidecode
python create_reports_info.py
