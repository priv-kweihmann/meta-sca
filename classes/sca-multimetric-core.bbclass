## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## File extension filter list (whitespace separated)
SCA_MULTIMETRIC_FILE_FILTER ?= ".c .C .c++ .cc .cp .cpp .CPP \
                                .cxx .go .h .H .h++ .hh .hpp \
                                .hxx .idc .js .jsm .lua .php \
                                .php3 .php4 .php5 .pl .pm .pxd \
                                .pxi .py .pyx .rb .ruby .duby \
                                .t .wlua"
SCA_MULTIMETRIC_EXTRA_SUPPRESS ?= ""
SCA_MULTIMETRIC_EXTRA_FATAL ?= ""

# possible entries for variables are    
# comment_ratio
# cyclomatic_complexity
# fanout_external
# fanout_internal
# halstead_bugprop
# halstead_difficulty
# halstead_effort
# halstead_timerequired
# halstead_volume
# loc
# maintainability_index
# operands_sum
# operands_uniq
# operators_sum
# operators_uniq
# pylint
# tiobe_compiler
# tiobe_complexity
# tiobe_coverage
# tiobe_duplication
# tiobe_fanout    
# tiobe_functional
# tiobe_security
# tiobe_standard
# tiobe

SCA_MULTIMETRIC_COMPILER_MODULES = "gcc"

SCA_RAW_RESULT_FILE[multimetric] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit python3native

def do_sca_conv_multimetric(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _suppress = sca_suppress_init(d, "SCA_MULTIMETRIC_EXTRA_SUPPRESS", 
                                  d.expand("${STAGING_DATADIR_NATIVE}/multimetric-${SCA_MODE}-suppress"))
    _findings = []
    if os.path.exists(sca_raw_result_file(d, "multimetric")):
        j = {}
        try:
            with open(sca_raw_result_file(d, "multimetric")) as i:
                j = json.load(i)
        except Exception as e:
            j = {"files": {}}
        try:
            for _file, v in j["files"].items():
                for _item in v.keys():
                    ## lt error
                    if d.getVar("SCA_MULTIMETRIC_ERROR_{}_lt".format(_item)):
                        threshold = float(d.getVar("SCA_MULTIMETRIC_ERROR_{}_lt".format(_item)))
                        val = float(str(v[_item]))
                        if val < threshold:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="multimetric",
                                                    BuildPath=buildpath,
                                                    File=_file,
                                                    Message="value {} is {}<{}".format(_item, val, threshold),
                                                    ID=_item,
                                                    Severity="error")
                            if _suppress.Suppressed(g):
                                continue
                            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                    elif d.getVar("SCA_MULTIMETRIC_ERROR_{}_gt".format(_item)):
                        threshold = float(d.getVar("SCA_MULTIMETRIC_ERROR_{}_gt".format(_item)))
                        val = float(str(v[_item]))
                        if val > threshold:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="multimetric",
                                                    BuildPath=buildpath,
                                                    File=_file,
                                                    Message="value {} is {}>{}".format(_item, val, threshold),
                                                    ID=_item,
                                                    Severity="error")
                            if _suppress.Suppressed(g):
                                continue
                            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                    elif d.getVar("SCA_MULTIMETRIC_WARN_{}_lt".format(_item)):
                        threshold = float(d.getVar("SCA_MULTIMETRIC_WARN_{}_lt".format(_item)))
                        val = float(str(v[_item]))
                        if val < threshold:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="multimetric",
                                                    BuildPath=buildpath,
                                                    File=_file,
                                                    Message="value {} is {}<{}".format(_item, val, threshold),
                                                    ID=_item,
                                                    Severity="warning")
                            if _suppress.Suppressed(g):
                                continue
                            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                    elif d.getVar("SCA_MULTIMETRIC_WARN_{}_gt".format(_item)):
                        threshold = float(d.getVar("SCA_MULTIMETRIC_WARN_{}_gt".format(_item)))
                        val = float(str(v[_item]))
                        if val > threshold:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="multimetric",
                                                    BuildPath=buildpath,
                                                    File=_file,
                                                    Message="value {} is {}>{}".format(_item, val, threshold),
                                                    ID=_item,
                                                    Severity="warning")
                            if _suppress.Suppressed(g):
                                continue
                            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
        except Exception as e:
            bb.note(str(e))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

def get_findings_as_csv(d, tools, scope=["security", "functional", "compliance", "style"]):
    res = ""
    for t in tools:
        _path = "{}/{}.dm".format(d.getVar("T"), t)
        if not os.path.exists(_path):
            continue
        for item in sca_get_datamodel(d, _path):
            if item.Scope not in scope:
                continue
            res += "{},{},{}\n".format(item.GetPath(), item.Message, item.Severity)
    return res

python do_sca_multimetric_core() {
    import os
    import subprocess

    # Disable multiprocessing as it's way slower than single process execution
    _args = ["multimetric", "--jobs=1"]

    _compiler_modules = clean_split(d, "SCA_MULTIMETRIC_COMPILER_MODULES")

    _path = os.path.join(d.getVar("T"), "mm_warn_compiler.csv")
    with open(_path, "w") as o:
        _tool_list = intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES"))
        _tool_list = intersect_lists(d, _tool_list, _compiler_modules)
        res = get_findings_as_csv(d, _tool_list)
        if res:
            o.write(res)
            _args += ["--warn_compiler={}".format(_path)]

    _path = os.path.join(d.getVar("T"), "mm_warn_duplication.csv")
    with open(_path, "w") as o:
        _tool_list = intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES"))
        _tool_list = intersect_lists(d, _tool_list, ["tlv"])
        res = get_findings_as_csv(d, _tool_list)
        if res:
            o.write(res)
            _args += ["--warn_duplication={}".format(_path)]

    _path = os.path.join(d.getVar("T"), "mm_warn_functional.csv")
    with open(_path, "w") as o:
        _tool_list = [x for x in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")) if x not in _compiler_modules]
        res = get_findings_as_csv(d, _tool_list, ["functional"])
        if res:
            o.write(res)
            _args += ["--warn_functional={}".format(_path)]

    _path = os.path.join(d.getVar("T"), "mm_warn_standard.csv")
    with open(_path, "w") as o:
        _tool_list = [x for x in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")) if x not in _compiler_modules]
        res = get_findings_as_csv(d, _tool_list, ["style"])
        if res:
            o.write(res)
            _args += ["--warn_standard={}".format(_path)]

    _path = os.path.join(d.getVar("T"), "mm_warn_security.csv")
    with open(_path, "w") as o:
        _tool_list = [x for x in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")) if x not in _compiler_modules]
        res = get_findings_as_csv(d, _tool_list, ["security"])
        if res:
            o.write(res)
            _args += ["--warn_security={}".format(_path)]

    ## Run
    json_output = {}
    _files = get_files_by_extention(d,    
                                    d.getVar("SCA_SOURCES_DIR"),    
                                    clean_split(d, "SCA_MULTIMETRIC_FILE_FILTER"),    
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    cmd_output = "{}"
    if any(_files):
        try:
            cmd_output = subprocess.check_output(_args + _files, universal_newlines=True)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
    
    with open(sca_raw_result_file(d, "multimetric"), "w") as o:
        if not cmd_output:
            cmd_output = "{}"
        o.write(cmd_output)
}

python do_sca_multimetric_core_report() {
    import os
    # Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/multimetric.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_multimetric(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)
    sca_task_aftermath(d, "multimetric", get_fatal_entries(d, "SCA_MULTIMETRIC_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/multimetric-${SCA_MODE}-fatal")))
}

DEPENDS += "python3-multimetric-native"
