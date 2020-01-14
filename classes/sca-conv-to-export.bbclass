## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-global
inherit sca-helper

def sca_allowed_warning_level(d):
    opts = ["info", "warning", "error"]
    while (opts and d.getVar("SCA_WARNING_LEVEL", True) != opts[0]):
        opts = opts[1:]
    return opts

def sca_conv_to_export(d):
    import bb
    from bb.parse.parse_py import BBHandler
    try:
        item = d.getVar("SCA_EXPORT_FORMAT", True)
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
    _exportformat = d.getVar("SCA_EXPORT_FORMAT", True)
    _exportsuffix = d.getVar("SCA_EXPORT_FORMAT_SUFFIX_{}".format(d.getVar("SCA_EXPORT_FORMAT", True)), True)
    return "sca_{}_{}.{}".format(_exportformat, tool, _exportsuffix)

def sca_conv_deploy(d, tool, rawsuffix):
    import os
    import shutil
    import os

    _dmsuffix = "dm"
    _exportformat = d.getVar("SCA_EXPORT_FORMAT", True)
    _exportsuffix = d.getVar("SCA_EXPORT_FORMAT_SUFFIX_{}".format(d.getVar("SCA_EXPORT_FORMAT", True)), True)

    try:
        os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR", True), tool, "raw"))
    except:
        pass
    try:
        os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR", True), tool, "datamodel"))
    except:
        pass
    try:
        os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR", True), tool, d.getVar("SCA_EXPORT_FORMAT", True)))
    except:
        pass

    if d.getVar("SCA_CLEAN_BEFORE_EXPORT", True) == "1":
        import glob
        raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR", True), 
                              tool, 
                              "raw", 
                              "{}-*.{}".format(d.getVar("PN", True), rawsuffix))
        dm_target = os.path.join(d.getVar("SCA_EXPORT_DIR", True), 
                                tool, 
                                "datamodel",
                                "{}-*.{}".format(d.getVar("PN", True), _dmsuffix))
        cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR", True), 
                                tool, 
                                _exportformat, 
                                "{}-*.{}".format(d.getVar("PN", True), _exportsuffix))
        for item in [raw_target, dm_target, cs_target]:
            for f in glob.glob(item):
                try:
                    os.remove(f)
                except:
                    ## Ignore any error here
                    pass

    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR", True), 
                              tool, 
                              "raw", 
                              "{}-{}.{}".format(d.getVar("PN", True), d.getVar("PV", True), rawsuffix))
    dm_target = os.path.join(d.getVar("SCA_EXPORT_DIR", True), 
                              tool, 
                              "datamodel",
                              "{}-{}.{}".format(d.getVar("PN", True), d.getVar("PV", True), _dmsuffix))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR", True), 
                             tool, 
                             _exportformat, 
                             "{}-{}.{}".format(d.getVar("PN", True), d.getVar("PV", True), _exportsuffix))
    src_raw = os.path.join(d.getVar("T", True), "sca_raw_{}.{}".format(tool, rawsuffix))
    src_dm = os.path.join(d.getVar("T", True), "{}.dm".format(tool))
    src_conv = os.path.join(d.getVar("T", True), sca_conv_export_get_deployname(d, tool))
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(src_dm):
        shutil.copy(src_dm, dm_target)