## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2022, Konrad Weihmann

# This file contains overridden functions for the sdk exporter

inherit sca-global
inherit sca-helper

def sca_conv_dm_console_sdk(d, tool):
    import json
    import os
    import sys

    res = []

    _items = sca_get_datamodel(d, d.getVar("SCA_DATAMODEL_STORAGE"))

    filenames = list(set([x.File for x in _items]))

    for _file in filenames:
        _firstItem = [x for x in _items if x.File == _file ]
        if any(_firstItem):
            _firstItem = _firstItem[0]
        else:
            continue
    for i in _items:
        res.append("[{}] {}:{}:{} - {} - [{}]".format(i.Severity, i.GetPath(), i.Line, i.Column, i.Message, i.GetFormattedID()))
        sys.stderr.write(res[-1] + "\n")

    return "\n".join(res)

def sca_conv_to_export_sdk(d, tool):
    return sca_conv_dm_console_sdk(d, tool)

def sca_backtrack_findings_sdk(d, g):
    return [g]

def sca_filter_by_license_image_sdk(d):
    return []

def do_sca_deploy_sdk():
    pass

def should_emit_to_console_sdk(d):
    return False

def sca_log_note_sdk(d, msg):
    pass

def sca_module_applicable_sdk(d, module):
    return True

def sca_raw_result_file_sdk(d, tool):
    import os
    return os.path.join("/tmp", "sca_raw_{}".format(tool))

def sca_task_aftermath_sdk(d, tool, fatals=None):
    sca_conv_to_export(d, tool)
