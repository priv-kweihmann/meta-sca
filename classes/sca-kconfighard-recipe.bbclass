## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_KCONFIGHARD_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_KCONFIGHARD_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[kconfighard] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack

inherit python3native

DEPENDS += "kconfig-hardened-check-native sca-recipe-kconfighard-rules-native"

def do_sca_conv_kconfighard(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    _suppress = sca_suppress_init(d, clean_split(d, "SCA_KCONFIGHARD_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/kconfighard-${SCA_MODE}-suppress"),
                                  file_trace=False)
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "kconfighard")):
        with open(sca_raw_result_file(d, "kconfighard"), "r") as f:
            try:
                j = json.load(f)
                for item in j:
                    if not item['check_result_bool']:
                        g = sca_get_model_class(d,
                                                PackageName=package_name,
                                                Tool="kconfighard",
                                                File=".config",
                                                BuildPath=d.getVar("B"),
                                                Message="{} should be '{}'".format(item['option_name'], item['desired_val']),
                                                Severity="warning",
                                                ID=item['option_name'])
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

python do_sca_kconfighard() {
    import os
    import subprocess

    if bb.data.inherits_class('kernel', d):
        if not os.path.exists(os.path.join(d.getVar("B"), "config")):
            os.symlink(os.path.join(d.getVar("B"), ".config"), os.path.join(d.getVar("B"), "config"))

        _args = ["kernel-hardening-checker"]
        _args += ["-c", os.path.join(d.getVar("B"), ".config"), '-m=json']

        cmd_output = ""

        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""

        with open(sca_raw_result_file(d, "kconfighard"), "w") as o:
            o.write(cmd_output)

        org_source_value = d.getVar("SCA_SOURCES_DIR")
        ## patch the source of the config-file
        d.setVar("SCA_SOURCES_DIR", os.path.join(d.getVar("B"), ".config"))

        ## Create data model
        d.setVar("SCA_DATAMODEL_STORAGE", "{}/kconfighard.dm".format(d.getVar("T")))
        dm_output = do_sca_conv_kconfighard(d)
        with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
            o.write(dm_output)

        sca_task_aftermath(d, "kconfighard", get_fatal_entries(d, clean_split(d, "SCA_KCONFIGHARD_EXTRA_FATAL"),
                            d.expand("${STAGING_DATADIR_NATIVE}/kconfighard-${SCA_MODE}-fatal")))
}

do_sca_kconfighard[vardeps] += "\
    SCA_KCONFIGHARD_EXTRA_FATAL \
    SCA_KCONFIGHARD_EXTRA_SUPPRESS \
    SCA_SCOPE_FILTER \
    SCA_SEVERITY_TRANSFORM \
    SCA_SUPPRESS_LOCALS \
"

do_sca_kconfighard[doc] = "Scan for kernel config hardening options"
addtask do_sca_kconfighard before do_sca_deploy after do_configure
