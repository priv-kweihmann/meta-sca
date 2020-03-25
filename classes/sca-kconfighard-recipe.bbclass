## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_KCONFIGHARD_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_KCONFIGHARD_EXTRA_FATAL ?= ""

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

inherit python3native

DEPENDS += "kconfig-hardened-check-native sca-recipe-kconfighard-rules-native"

def do_sca_conv_kconfighard(d):
    import os
    import re
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^\s*(?P<symbol>CONFIG_[A-Z0-9_]+)\s*\|\s*(?P<exp>.*?\s*)\|\s*(?P<source>\w+\s*)\|.*\|\|\s*(?P<result>.*)"

    severity_map = {
        "defconfig" : "error",
        "kspp": "warning",
        "my": "warning",
        "grsecurity" : "warning",
        "lockdown" : "warning"
    }

    _suppress = sca_suppress_init(d)
    _findings = []

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        with open(d.getVar("SCA_RAW_RESULT_FILE"), "r") as f:
            for m in re.finditer(pattern, f.read(), re.MULTILINE):
                try:
                    result_fail = m.group("result").strip().startswith("FAIL:")
                    if not result_fail:
                        continue
                    clean_result = m.group("result").strip().replace("FAIL:", "").replace("OK:", "").replace("\"", "").strip()
                    
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="kconfighard",
                                            File=".config",
                                            BuildPath=d.getVar("B"),
                                            Message="{} should be {} but is {}".format(m.group("symbol"), m.group("exp").strip(), clean_result),
                                            ID=m.group("symbol"))
                    if m.group("source") in severity_map.keys():
                        g.Severity = severity_map[m.group("source")]
                    else:
                        ## default to warning
                        g.Severity = "warning"
                    if _suppress.Suppressed(g):
                        continue
                    if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                        continue
                    if g.Severity in sca_allowed_warning_level(d):
                        _findings.append(g)
                except Exception as exp:
                    bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_kconfighard() {
    import os
    import subprocess

    if d.getVar("PN") == "linux-yocto":
        d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_KCONFIGHARD_EXTRA_SUPPRESS"))
        d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_KCONFIGHARD_EXTRA_FATAL"))
        d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "kconfighard-{}-suppress".format(d.getVar("SCA_MODE"))))
        d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "kconfighard-{}-fatal".format(d.getVar("SCA_MODE"))))

        tmp_result = os.path.join(d.getVar("T", True), "sca_raw_kconfighard.txt")
        d.setVar("SCA_RAW_RESULT_FILE", tmp_result)

        if not os.path.exists(os.path.join(d.getVar("B"), "config")):
            os.symlink(os.path.join(d.getVar("B"), ".config"), os.path.join(d.getVar("B"), "config"))

        _args = ["nativepython3", os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "kconfig-hardening-check", "kconfig-hardened-check.py")]      
        _args += ["-c", os.path.join(d.getVar("B"), ".config")]

        cmd_output = ""

        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""

        with open(tmp_result, "w") as o:
            o.write(cmd_output)

        result_file = os.path.join(d.getVar("T", True), "sca_checkstyle_kconfighard.xml")
        d.setVar("SCA_RESULT_FILE", result_file)

        org_source_value = d.getVar("SCA_SOURCES_DIR")
        ## patch the source of the config-file
        d.setVar("SCA_SOURCES_DIR", os.path.join(d.getVar("B"), ".config"))

        ## Create data model
        d.setVar("SCA_DATAMODEL_STORAGE", "{}/kconfighard.dm".format(d.getVar("T")))
        dm_output = do_sca_conv_kconfighard(d)
        with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
            o.write(dm_output)

        sca_task_aftermath(d, "kconfighard", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_kconfighard"

python do_sca_deploy_kconfighard() {
    sca_conv_deploy(d, "kconfighard", "txt")
}

addtask do_sca_kconfighard before do_compile after do_configure
addtask do_sca_deploy_kconfighard after do_sca_kconfighard before do_compile
