## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-global
inherit sca-helper

def sca_allowed_warning_level(d):
    if not hasattr(sca_allowed_warning_level, "allowed"):
        opts = ["info", "warning", "error"] 
        while (opts and d.getVar("SCA_WARNING_LEVEL") != opts[0]):
            opts = opts[1:]
        sca_allowed_warning_level.allowed = opts
    return sca_allowed_warning_level.allowed

def sca_conv_to_export(d, tool):
    import bb
    from bb.parse.parse_py import BBHandler

    res = []
    for item in clean_split(d, "SCA_EXPORT_FORMAT"):
        res_file = sca_conv_export_get_deployname(d, tool, item)
        try:
            BBHandler.inherit("sca-conv-dm-{}".format(item), "sca-export", 1, d)
            func = "sca_conv_dm_{}".format(item)
            if func in locals().keys():
                res.append((locals()[func](d, tool), res_file))
            elif func in globals().keys():
                res.append((globals()[func](d, tool), res_file))
            else:
                raise NotImplementedError()
        except bb.parse.ParseError as e:
            sca_log_note(d, str(e))
    return res

def sca_conv_export_get_deployname(d, tool, _format):
    _exportsuffix = d.getVar("SCA_EXPORT_FORMAT_SUFFIX_{}".format(_format))
    return "sca_{}_{}.{}".format(_format, tool, _exportsuffix)

def sca_conv_deploy(d, tool):
    import os
    import shutil
    import subprocess

    _dmsuffix = "dm"
    _rawsuffix = d.getVarFlag("SCA_RAW_RESULT_FILE", tool)

    for _exportformat in clean_split(d, "SCA_EXPORT_FORMAT"):
        _exportsuffix = d.getVar("SCA_EXPORT_FORMAT_SUFFIX_{}".format(_exportformat))

        os.makedirs(os.path.join(d.getVar("SCA_FINDINGS_DIR"), tool, "raw"),
                    exist_ok=True)
        os.makedirs(os.path.join(d.getVar("SCA_FINDINGS_DIR"), tool, "datamodel"),
                    exist_ok=True)
        os.makedirs(os.path.join(d.getVar("SCA_FINDINGS_DIR"), tool, _exportformat),
                    exist_ok=True)

        if d.getVar("SCA_CLEAN_BEFORE_EXPORT") == "1":
            import glob
            raw_target = os.path.join(d.getVar("SCA_FINDINGS_DIR"),
                                tool,
                                "raw",
                                "{}-*.{}".format(d.getVar("PN"), _rawsuffix))
            dm_target = os.path.join(d.getVar("SCA_FINDINGS_DIR"),
                                    tool,
                                    "datamodel",
                                    "{}-*.{}".format(d.getVar("PN"), _dmsuffix))
            cs_target = os.path.join(d.getVar("SCA_FINDINGS_DIR"),
                                    tool,
                                    _exportformat,
                                    "{}-*.{}".format(d.getVar("PN"), _exportsuffix))
            for item in [raw_target, dm_target, cs_target]:
                try:
                    subprocess.check_call(["/bin/sh", "-c", "rm -f {}".format(item)])
                except:
                    pass

        raw_target = os.path.join(d.getVar("SCA_FINDINGS_DIR"),
                                tool,
                                "raw",
                                "{}-{}.{}".format(d.getVar("PN"), d.getVar("PV"), _rawsuffix))
        dm_target = os.path.join(d.getVar("SCA_FINDINGS_DIR"),
                                tool,
                                "datamodel",
                                "{}-{}.{}".format(d.getVar("PN"), d.getVar("PV"), _dmsuffix))
        cs_target = os.path.join(d.getVar("SCA_FINDINGS_DIR"),
                                tool,
                                _exportformat,
                                "{}-{}.{}".format(d.getVar("PN"), d.getVar("PV"), _exportsuffix))
        src_raw = os.path.join(d.getVar("T"), "sca_raw_{}.{}".format(tool, _rawsuffix))
        src_dm = os.path.join(d.getVar("T"), "{}.dm".format(tool))
        src_conv = os.path.join(d.getVar("T"), sca_conv_export_get_deployname(d, tool, _exportformat))
        if os.path.exists(src_raw):
            shutil.copy(src_raw, raw_target)
        if os.path.exists(src_conv):
            shutil.copy(src_conv, cs_target)
        if os.path.exists(src_dm):
            shutil.copy(src_dm, dm_target)
