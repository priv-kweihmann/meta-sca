## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_GIXY_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_GIXY_EXTRA_FATAL ?= ""
## Default ngixn config file to pick
SCA_GIXY_NGINX_CONF ?= "/etc/nginx/nginx.conf"

SCA_RAW_RESULT_FILE[gixy] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_gixy(d, cmd_output=""):
    import os
    import re
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    items = []
    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<column>\d+):\s+(?P<severity>\w+):\s+(?P<message>.*)\s\[-(?P<id>.*)\]"

    severity_map = {
        "HIGH" : "error",
        "MEDIUM" : "warning",
        "LOW" : "info",
        "ERROR" : "error",
    }

    _suppress = sca_suppress_init(d, "SCA_GIXY_EXTRA_SUPPRESS",
                                    d.expand("${STAGING_DATADIR_NATIVE}/gixy-${SCA_MODE}-suppress"))
    _findings = []

    ## Result file parsing
    if os.path.exists(sca_raw_result_file(d, "gixy")):
        io = {}
        with open(sca_raw_result_file(d, "gixy")) as i:
            try:
                io = json.load(i)
            except:
                pass
        for item in io:
            try:
                g = sca_get_model_class(d,
                                        PackageName=package_name,
                                        Tool="gixy",
                                        BuildPath=d.getVar("IMAGE_ROOTFS"),
                                        File=item["path"],
                                        Message="{} {}".format(item["summary"], item["reason"]),
                                        ID=item["plugin"].replace(" ", "_"),
                                        Severity=severity_map[str(item["severity"])])
                if _suppress.Suppressed(g):
                    continue
                if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                    continue
                if g.Severity in sca_allowed_warning_level(d):
                    _findings.append(g)
            except Exception as e:
                bb.note(str(e))

    ## Run log parsing
    pattern = r'^.*\[nginx_parser\]\s+(?P<severity>[A-Z]+)\s+Failed to parse config\s.(?P<file>.*)":\s+(?P<msg>.*)\s+\(line:(?P<line>\d+),\s+col:(?P<col>\d+)'
    for m in re.finditer(pattern, cmd_output.replace("\t", " "), re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="gixy",
                                    BuildPath=buildpath,
                                    Column=m.group("col"),
                                    Line=m.group("line"),
                                    File=m.group("file"),
                                    Message=m.group("msg"),
                                    ID="ParserFailure",
                                    Severity=severity_map[m.group("severity")])
            if g.GetPlainID() in __suppress:
                continue
            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
        except Exception as e:
            bb.note(str(e))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_gixy() {
    import os
    import subprocess

    cmd_output = ""

    ## Run
    _file = d.getVar("SCA_GIXY_NGINX_CONF")
    if os.path.isabs(_file):
        _file = _file.lstrip("/")

    if os.path.exists(os.path.join(d.getVar("SCA_SOURCES_DIR"), _file)):
        _args = ["gixy"]
        _args += ["--root-dir={}".format(d.getVar("SCA_SOURCES_DIR"))]
        _args += ["-f", "json"]
        _args += ["-l"]
        _args += ["-o", sca_raw_result_file(d, "gixy")]
        _args += [d.getVar("SCA_GIXY_NGINX_CONF")]

        try:
            cmd_output = subprocess.check_output(_args, universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""

    if not os.path.exists(sca_raw_result_file(d, "gixy")):
        import json
        with open(sca_raw_result_file(d, "gixy"), "w") as o:
            json.dump([], o)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/gixy.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_gixy(d, cmd_output)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "gixy", get_fatal_entries(d, "SCA_GIXY_EXTRA_FATAL",
                        d.expand("${STAGING_DATADIR_NATIVE}/gixy-${SCA_MODE}-fatal")))
}

SCA_DEPLOY_TASK = "do_sca_deploy_gixy"

python do_sca_deploy_gixy() {
    sca_conv_deploy(d, "gixy")
}

do_sca_gixy[doc] = "Scan for nxginx misconfigurations in image"
do_sca_deploy_gixy[doc] = "Deploy results of do_sca_gixy"
addtask do_sca_gixy before do_image_complete after do_image
addtask do_sca_deploy_gixy before do_image_complete after do_sca_gixy

DEPENDS += "python3-gixy-native sca-image-gixy-rules-native"
