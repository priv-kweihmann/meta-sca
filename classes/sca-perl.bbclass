## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_PERL_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PERL_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_PERL_FILE_FILTER ?= ".pl"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_perl(d):
    import os
    import re
    import hashlib
    
    package_name = d.getVar("PN", True)
    buildpath = d.getVar("SCA_SOURCES_DIR", True)

    items = []
    pattern = r"^(?P<msg>.*)\s+at\s+(?P<file>.*)\s+line\s+(?P<line>\d+)"

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE", True)):
        with open(d.getVar("SCA_RAW_RESULT_FILE", True), "r") as f:
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
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_PERL_EXTRA_SUPPRESS", True))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_PERL_EXTRA_FATAL", True))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "perl-{}-suppress".format(d.getVar("SCA_MODE", True))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "perl-{}-fatal".format(d.getVar("SCA_MODE", True))))

    _args = [ "perl", "-c", "-W"]

    cmd_output = ""
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_perl.txt")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

    _files = get_files_by_extention_or_shebang(d, 
                                                d.getVar("SCA_SOURCES_DIR", True),
                                                ".*/perl",
                                                clean_split(d, "SCA_PERL_FILE_FILTER"), 
                                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR", True), clean_split(d, "SCA_FILE_FILTER_EXTRA")))

    ## Run
    for f in _files:
        try:
            cmd_output += subprocess.check_output(_args + [f], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output += e.stdout or ""
    with open(tmp_result, "w") as o:
        o.write(cmd_output)
    
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/perl.dm".format(d.getVar("T", True)))
    dm_output = do_sca_conv_perl(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE", True), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "perl", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_perl"

python do_sca_deploy_perl() {
    sca_conv_deploy(d, "perl", "txt")
}

addtask do_sca_perl before do_compile after do_configure
addtask do_sca_deploy_perl after do_sca_perl before do_package

do_sca_perl[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_perl[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "perl-sca-native sca-recipe-perl-rules-native"
