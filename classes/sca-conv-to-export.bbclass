## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-global
inherit sca-helper

def sca_allowed_warning_level(d):
    opts = ["info", "warning", "error"]
    while (opts and d.getVar("SCA_WARNING_LEVEL") != opts[0]):
        opts = opts[1:]
    return opts

__SCA_IN_SCOPE = ""
__SCA_OUT_OF_SCOPE = ""

def sca_is_in_finding_scope(d, tool, _id):
    import os
    import json
    import re
    import bb

    if bb.utils.contains("__SCA_IN_SCOPE", _id, True, False, d):
        return True
    if bb.utils.contains("__SCA_OUT_OF_SCOPE", _id, True, False, d):
        return False

    _path = os.path.join(d.getVar("STAGING_DATADIR_NATIVE"), "{}.sca.description".format(tool))
    if os.path.exists(_path):
        with open(_path) as i:
            score = json.load(i)
            if "score" not in score:
                score["score"] = {}
            for _scope in clean_split(d, "SCA_SCOPE_FILTER"):
                if not _scope in score.keys():
                    continue
                for f in score[_scope]:
                    if re.match(f, _id):
                        d.appendVar("__SCA_IN_SCOPE", " " + _id)
                        return True
    else:
        bb.warn("{} is missing a .sca.description-file".format(tool))
    d.appendVar("__SCA_OUT_OF_SCOPE", " " + _id)
    return False

def sca_conv_to_export(d):
    import bb
    from bb.parse.parse_py import BBHandler
    try:
        item = d.getVar("SCA_EXPORT_FORMAT")
        BBHandler.inherit("sca-conv-dm-{}".format(item), "sca-export", 1, d)
        func = "sca_conv_dm_{}".format(item)
        if func in locals().keys():
            return locals()[func](d)
        elif func in globals().keys():
            return globals()[func](d)
        else:
            raise NotImplementedError()
    except bb.parse.ParseError as e:
        bb.warn(str(e))

def sca_conv_export_get_deployname(d, tool):
    _exportformat = d.getVar("SCA_EXPORT_FORMAT")
    _exportsuffix = d.getVar("SCA_EXPORT_FORMAT_SUFFIX_{}".format(d.getVar("SCA_EXPORT_FORMAT")))
    return "sca_{}_{}.{}".format(_exportformat, tool, _exportsuffix)

def sca_conv_deploy(d, tool, rawsuffix):
    import os
    import shutil
    import os

    _dmsuffix = "dm"
    _exportformat = d.getVar("SCA_EXPORT_FORMAT")
    _exportsuffix = d.getVar("SCA_EXPORT_FORMAT_SUFFIX_{}".format(d.getVar("SCA_EXPORT_FORMAT")))

    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), tool, "raw"), 
                exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), tool, "datamodel"), 
                exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), tool, d.getVar("SCA_EXPORT_FORMAT")), 
                exist_ok=True)

    if d.getVar("SCA_CLEAN_BEFORE_EXPORT") == "1":
        import glob
        raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), 
                              tool, 
                              "raw", 
                              "{}-*.{}".format(d.getVar("PN"), rawsuffix))
        dm_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), 
                                tool, 
                                "datamodel",
                                "{}-*.{}".format(d.getVar("PN"), _dmsuffix))
        cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), 
                                tool, 
                                _exportformat, 
                                "{}-*.{}".format(d.getVar("PN"), _exportsuffix))
        for item in [raw_target, dm_target, cs_target]:
            for f in glob.glob(item):
                try:
                    os.remove(f)
                except:
                    ## Ignore any error here
                    pass

    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), 
                              tool, 
                              "raw", 
                              "{}-{}.{}".format(d.getVar("PN"), d.getVar("PV"), rawsuffix))
    dm_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), 
                              tool, 
                              "datamodel",
                              "{}-{}.{}".format(d.getVar("PN"), d.getVar("PV"), _dmsuffix))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), 
                             tool, 
                             _exportformat, 
                             "{}-{}.{}".format(d.getVar("PN"), d.getVar("PV"), _exportsuffix))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_{}.{}".format(tool, rawsuffix))
    src_dm = os.path.join(d.getVar("T"), "{}.dm".format(tool))
    src_conv = os.path.join(d.getVar("T"), sca_conv_export_get_deployname(d, tool))
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(src_dm):
        shutil.copy(src_dm, dm_target)