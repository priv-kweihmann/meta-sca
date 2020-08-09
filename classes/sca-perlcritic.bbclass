## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PERLCRITIC_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PERLCRITIC_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_PERLCRITIC_FILE_FILTER ?= ".pl"

SCA_RAW_RESULT_FILE[perlcritic] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_perlcritic(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*)\:\s+\[(?P<id>.*)\]\s(?P<msg>.*)\s+at\s+line\s+(?P<line>\d+),\s+column\s+(?P<col>\d+)\.\s+\(Severity\:\s+(?P<severity>\d+)\)"

    _severity_map = {
        "5": "error",
        "4": "warning",
        "3": "warning",
        "2": "info",
        "1": "info"
    }

    _suppress = sca_suppress_init(d, "SCA_PERLCRITIC_EXTRA_SUPPRESS", 
                                   d.expand("${STAGING_DATADIR_NATIVE}/perlcritic-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "perlcritic")):
        with open(sca_raw_result_file(d, "perlcritic"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="perlcritic",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Column=m.group("col"),
                                            Message=m.group("msg"),
                                            ID=m.group("id"),
                                            Severity=_severity_map[m.group("severity")])
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as e:
                    bb.warn(str(e))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_perlcritic() {
    import os
    import subprocess

    #../recipe-sysroot-native/usr/bin/perl-native/perl $(which perlcritic) --nocolor --verbose 8 --brutal *.pl
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "perl-native", "perl")]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "perlcritic")]
    _args += ["--nocolor", "--brutal"]
    _args += ["--verbose", '%f: [%p] %m at line %l, column %c.  (Severity: %s)\n']

    _files = get_files_by_extention_or_shebang(d,    
                                                d.getVar("SCA_SOURCES_DIR"),
                                                ".*/perlcritic",
                                                clean_split(d, "SCA_PERLCRITIC_FILE_FILTER"),    
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    cmd_output = exec_wrap_check_output(_args, _files)

    with open(sca_raw_result_file(d, "perlcritic"), "w") as o:
        o.write(cmd_output)
}

python do_sca_perlcritic_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/perlcritic.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_perlcritic(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "perlcritic", get_fatal_entries(d, "SCA_PERLCRITIC_EXTRA_FATAL", 
                        d.expand("${STAGING_DATADIR_NATIVE}/perlcritic-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_perlcritic"

python do_sca_deploy_perlcritic() {
    sca_conv_deploy(d, "perlcritic")
}

do_sca_perlcritic[doc] = "Lint perl scripts with perlcritic in workspace"
do_sca_perlcritic_report[doc] = "Report findings from do_sca_perlcritic"
do_sca_deploy_perlcritic[doc] = "Deploy results of do_sca_perlcritic"
addtask do_sca_perlcritic after do_configure before do_sca_tracefiles
addtask do_sca_perlcritic_report after do_sca_tracefiles
addtask do_sca_deploy_perlcritic after do_sca_perlcritic_report before do_package

DEPENDS += "perl-critic-native sca-recipe-perlcritic-rules-native"
