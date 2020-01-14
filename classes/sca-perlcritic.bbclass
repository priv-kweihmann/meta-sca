## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PERLCRITIC_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PERLCRITIC_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_PERLCRITIC_FILE_FILTER ?= ".pl"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_perlcritic(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<file>.*)\:\s+\[(?P<id>.*)\]\s(?P<msg>.*)\s+at\s+line\s+(?P<line>\d+),\s+column\s+(?P<col>\d+)\.\s+\(Severity\:\s+(?P<severity>\d+)\)"

    _severity_map = {
        "5": "error",
        "4": "warning",
        "3": "warning",
        "2": "info",
        "1": "info"
    }

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE", True)):
        with open(d.getVar("SCA_RAW_RESULT_FILE", True), "r") as f:
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
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PERLCRITIC_EXTRA_SUPPRESS", True))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PERLCRITIC_EXTRA_FATAL", True))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "perlcritic-{}-suppress".format(d.getVar("SCA_MODE", True))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "perlcritic-{}-fatal".format(d.getVar("SCA_MODE", True))))

    #../recipe-sysroot-native/usr/bin/perl-native/perl $(which perlcritic) --nocolor --verbose 8 --brutal *.pl
    _args = [os.path.join(d.getVar("STAGING_BINDIR_NATIVE", True), "perl-native", "perl")]
    _args += [os.path.join(d.getVar("STAGING_BINDIR_NATIVE", True), "perlcritic")]
    _args += ["--nocolor", "--brutal"]
    _args += ["--verbose", '%f: [%p] %m at line %l, column %c.  (Severity: %s)\n']

    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_perlcritic.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    _files = get_files_by_extention_or_shebang(d, 
                                                d.getVar("SCA_SOURCES_DIR", True),
                                                ".*/perlcritic",
                                                clean_split(d, "SCA_PERLCRITIC_FILE_FILTER"), 
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR", True), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    if any(_files):
        try:
            cmd_output += subprocess.check_output(_args + _files, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.output or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/perlcritic.dm".format(d.getVar("T", True)))
    dm_output = do_sca_conv_perlcritic(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE", True), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "perlcritic", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_perlcritic"

python do_sca_deploy_perlcritic() {
    sca_conv_deploy(d, "perlcritic", "txt")
}

addtask do_sca_perlcritic before do_compile after do_configure
addtask do_sca_deploy_perlcritic after do_sca_perlcritic before do_package

do_sca_perlcritic[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_perlcritic[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "perl-critic-native sca-recipe-perlcritic-rules-native"
