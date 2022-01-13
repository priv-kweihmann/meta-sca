## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_NPMAUDIT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_NPMAUDIT_EXTRA_FATAL ?= ""

SCA_RAW_RESULT_FILE[npmaudit] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack

def do_sca_conv_npmaudit(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    severity_map = {
        "critical" : "error",
        "high" : "error",
        "moderate" : "warning",
        "low" : "info"
    }

    _suppress = sca_suppress_init(d, "SCA_NPMAUDIT_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/npmaudit-${SCA_MODE}-suppress"),
                                  file_trace=False)
    _findings = []

    ## Result file parsing
    if os.path.exists(sca_raw_result_file(d, "npmaudit")):
        io = {}
        with open(sca_raw_result_file(d, "npmaudit")) as i:
            _version = 1
            try:
                io = json.load(i)
                if "vulnerabilities" in io:
                    _version = 2
                    io = io["vulnerabilities"]
                else:
                    io = io["advisories"]
            except:
                io = {}
        for k,v in io.items():
            try:
                if _version == 1:
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="npmaudit",
                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                            File=d.getVar("FILE"),
                                            Message=v["title"],
                                            ID=str(v["id"]),
                                            Severity=severity_map[v["severity"]])
                else:
                    if not any(v["via"]):
                        continue
                    if not isinstance(v["via"][0], dict):
                        # skip if we missing required information
                        continue
                    g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="npmaudit",
                                            BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                            File=d.getVar("FILE"),
                                            Message=v["via"][0]["title"],
                                            ID=str(v["via"][0]["source"]),
                                            Severity=severity_map[v["severity"]])
                if _suppress.Suppressed(g):
                    continue
                if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                    continue
                if g.Severity in sca_allowed_warning_level(d):
                    _findings += sca_backtrack_findings(d, g)
            except Exception as e:
                sca_log_note(d, str(e))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_npmaudit() {
    import os
    import subprocess

    cmd_output = "{}"

    os.environ["HOME"] = d.getVar("T")

    ## Run

    if os.path.exists(os.path.join(d.getVar("SCA_SOURCES_DIR"), "package-lock.json")):
        cur_dir = os.getcwd()
        os.chdir(d.getVar("SCA_SOURCES_DIR"))
        _args = ["npm", "audit", "--json"]

        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or "{}"
            # remove trailing extra data
            cmd_output = "}".join(cmd_output.split("}")[:-1]) + "}"
        os.chdir(cur_dir)

    with open(sca_raw_result_file(d, "npmaudit"), "w") as o:
        o.write(cmd_output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/npmaudit.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_npmaudit(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "npmaudit", get_fatal_entries(d, "SCA_NPMAUDIT_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/npmaudit-${SCA_MODE}-fatal")))
}

# This tool unfortunately needs online access
do_sca_npmaudit[network] = "1"
do_sca_npmaudit[doc] = "Audit of used NPM packages"
addtask do_sca_npmaudit before do_sca_deploy after do_compile

DEPENDS += "npmaudit-sca-native sca-recipe-npmaudit-rules-native"
