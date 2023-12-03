## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_CMAKE_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CMAKE_EXTRA_FATAL ?= ""
## Files to parse
SCA_CMAKE_LOGFILES ?= "do_configure do_compile do_install"

SCA_RAW_RESULT_FILE[cmake] = "txt"

SCA_CMAKE_DEPRECATION_WARNINGS ?= "1"

## Add additional cmake flags, to make parsing the horrible
## cmake output a little bit easier
EXTRA_OECMAKE:append = " \
    --log-context -DCMAKE_MESSAGE_CONTEXT='-->' \
    ${@oe.utils.ifelse(d.getVar('SCA_CMAKE_DEPRECATION_WARNINGS') == '1', '-DCMAKE_ERROR_DEPRECATED=ON -DCMAKE_WARN_DEPRECATED=ON', '')} \
"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

def do_sca_conv_cmake(d):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^CMake\s+(?P<severity>Warning|Deprecation Warning|Error)(\s+at\s+(?P<file>.*?):(?P<line>\d+).*)*:(?P<message>(\s+.*?\n)+?)(Call Stack|\n{2,}|\[^)"

    severity_map = {
        "Error" : "error",
        "Warning" : "warning",
        "Deprecation Warning": "warning",
    }

    _suppress = sca_suppress_init(d, clean_split(d, "SCA_CMAKE_EXTRA_SUPPRESS"),
                                    d.expand("${STAGING_DATADIR_NATIVE}/cmake-${SCA_MODE}-suppress"))
    _excludes = sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "cmake")):
        with open(sca_raw_result_file(d, "cmake"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="cmake",
                                            BuildPath=buildpath,
                                            File=m.groupdict().get("file", os.path.join(buildpath, "CMakeLists.txt")),
                                            Line=m.groupdict().get("line", "1"),
                                            Message=m.group("message").replace(buildpath, ""),
                                            ID="cmake.cmake.{}".format(severity_map[m.group("severity")]),
                                            Severity=severity_map[m.group("severity")])
                    if g.File in _excludes:
                        continue
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings += sca_backtrack_findings(d, g)
                except Exception as exp:
                    sca_log_note(d, str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

do_sca_cmake() {
    echo "" > ${@sca_raw_result_file(d, "cmake")}
    for _file in ${SCA_CMAKE_LOGFILES}; do
        cat ${T}/log.$_file >> ${@sca_raw_result_file(d, "cmake")} || true
    done
}

python do_sca_cmake_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cmake.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_cmake(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "cmake", get_fatal_entries(d, clean_split(d, "SCA_CMAKE_EXTRA_FATAL"),
                         d.expand("${STAGING_DATADIR_NATIVE}/cmake-${SCA_MODE}-fatal")))
}

do_sca_cmake_report[vardeps] += "\
    SCA_CMAKE_EXTRA_FATAL \
    SCA_CMAKE_EXTRA_SUPPRESS \
    SCA_SCOPE_FILTER \
    SCA_SEVERITY_TRANSFORM \
    SCA_SUPPRESS_LOCALS \
"

do_sca_cmake[doc] = "Get cmake errors and warnings"
do_sca_cmake_report[doc] = "Report findings of do_sca_cmake"
addtask do_sca_cmake after ${SCA_CMAKE_LOGFILES} before do_sca_tracefiles
addtask do_sca_cmake_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "sca-recipe-cmake-rules-native cmake-sca-native"
