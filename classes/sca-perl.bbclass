## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PERL_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PERL_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_PERL_FILE_FILTER ?= ".pl"

SCA_RAW_RESULT_FILE[perl] = "txt"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-tracefiles

def do_sca_conv_perl(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<msg>.*)\s+at\s+(?P<file>.*)\s+line\s+(?P<line>\d+)"

    _suppress = sca_suppress_init(d, "SCA_PERL_EXTRA_SUPPRESS", 
                                  d.expand("${STAGING_DATADIR_NATIVE}/perl-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "perl")):
        with open(sca_raw_result_file(d, "perl"), "r") as f:
            content = f.read()
            for m in re.finditer(pattern, content, re.MULTILINE):
                _sev = "warning"
                if m.group("msg") in ["syntax error", "Search pattern not terminated"]:
                    _sev = "error"
                try:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="perl",
                                            BuildPath=buildpath,
                                            File=m.group("file"),
                                            Line=m.group("line"),
                                            Message=m.group("msg"),
                                            ID=hashlib.md5(str.encode(m.group("msg"))).hexdigest(),
                                            Severity=_sev)
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

python do_sca_perl() {
    import os
    import subprocess

    _args = [ "perl", "-c", "-W"]

    cmd_output = ""

    _files = get_files_by_extention_or_shebang(d,    
                                                d.getVar("SCA_SOURCES_DIR"),
                                                ".*/perl",
                                                clean_split(d, "SCA_PERL_FILE_FILTER"),    
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    for f in _files:
        try:
            cmd_output += subprocess.check_output(_args + [f], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""
    with open(sca_raw_result_file(d, "perl"), "w") as o:
        o.write(cmd_output)
}

python do_sca_perl_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/perl.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_perl(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "perl", get_fatal_entries(d, "SCA_PERL_EXTRA_FATAL", 
                        d.expand("${STAGING_DATADIR_NATIVE}/perl-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_perl"

python do_sca_deploy_perl() {
    sca_conv_deploy(d, "perl")
}

do_sca_perl[doc] = "Lint perl scripts in workspace"
do_sca_perl_report[doc] = "Report findings of do_sca_perl"
do_sca_deploy_perl[doc] = "Deploy results of do_sca_perl"
addtask do_sca_perl after do_configure before do_sca_tracefiles
addtask do_sca_perl_report after do_sca_tracefiles
addtask do_sca_deploy_perl after do_sca_perl_report before do_package

DEPENDS += "perl-sca-native sca-recipe-perl-rules-native"
