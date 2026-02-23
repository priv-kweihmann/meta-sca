## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2026, Konrad Weihmann

## Add ids to suppress on a recipe level
SCA_CARGODENY_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_CARGODENY_EXTRA_FATAL ?= ""
## File extension filter list (whitespace separated)
SCA_CARGODENY_FILE_FILTER ?= "Cargo.toml **/Cargo.toml"
## Checks to perform
SCA_CARGODENY_CHECKS ?= "advisories ban bans sources"
## IDs to skip in reports (mostly temporary issues like network)
SCA_CARGODENY_SKIP_IDS = "index-failure advisory-ignored yanked-ignored index-cache-load-failure allowed checksum-match"
## advisories DB location
SCA_CARGODENY_ADVISORIES_PATH ?= "${STAGING_DATADIR_NATIVE}"

SCA_RAW_RESULT_FILE[cargodeny] = "json"
SCA_RAW_RESULT_FILE[cargodeny_raw] = "txt"

SCA_ACTIVE_MODULES:append = " cargodeny_raw"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-tracefiles

def do_sca_conv_cargodeny(d):
    import os
    import re
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _findings = []
    _suppress = sca_suppress_init(d, clean_split(d, "SCA_CARGODENY_EXTRA_SUPPRESS"),
                                  d.expand("${STAGING_DATADIR_NATIVE}/cargodeny-${SCA_MODE}-suppress"))

    _skip_ids = clean_split(d, "SCA_CARGODENY_SKIP_IDS")
    if os.path.exists(sca_raw_result_file(d, "cargodeny")):
        with open(sca_raw_result_file(d, "cargodeny"), "r") as f:
            cnt = json.load(f)
            for item in cnt:
                if 'fields' in item.keys():
                    item = item['fields']

                    try:
                        _severity = item.get('severity', 'info')
                        _raw_id = item.get("code", "")
                        _id = f'cargodeny.cargodeny.{_raw_id}'
                        _message = item.get('message', '')
                        
                        if _severity not in sca_allowed_warning_level(d):
                            continue
                        if not _raw_id or not _message or _raw_id in _skip_ids:
                            continue
                        g = sca_get_model_class(d,
                                            PackageName=package_name,
                                            Tool="cargodeny",
                                            BuildPath=buildpath,
                                            File="Cargo.lock",
                                            Message=_message,
                                            ID=_id,
                                            Severity=_severity)
                        if _suppress.Suppressed(g):
                            continue
                        if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                            continue
                        _findings += sca_backtrack_findings(d, g)
                    except Exception as exp:
                        sca_log_note(d, str(exp))
    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_cargodeny() {
    import os
    import json
    import subprocess

    with open(d.expand("${T}/deny-cfg.toml"), "w") as o:
        o.write('[advisories]\n')
        o.write(f'db-path = "{d.getVar("SCA_CARGODENY_ADVISORIES_PATH")}"\n')

    os.environ["CARGO_HOME"] = d.expand('${CARGO_HOME}/bitbake')

    _args = ["cargo", "deny", "-f", "json", "-c", "never"]
    _args_post = ["check",
                  "-d",
                  "-c", d.expand("${T}/deny-cfg.toml"),
                  "--hide-inclusion-graph",
                  "--exclude-dev",
                  *clean_split(d, "SCA_CARGODENY_CHECKS")]

    _files = get_files_by_glob(d,
                                d.getVar("SCA_SOURCES_DIR"),
                                d.getVar("SCA_CARGODENY_FILE_FILTER"),
                                sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    ## Run
    cmd_output = []
    _tmp = ""
    for item in _files:
        _tmp += exec_wrap_tool_exec(_args + [f'--manifest-path={item}'] + _args_post, [])

    cmd_output += [json.loads(x) for x in _tmp.split('\n') if x.startswith('{')]
    with open(sca_raw_result_file(d, "cargodeny_raw"), "w") as o:
        o.write(_tmp)
    with open(sca_raw_result_file(d, "cargodeny"), "w") as o:
        json.dump(cmd_output, o)
}

do_sca_cargodeny[vardeps] += "\
    SCA_CARGODENY_ADVISORIES_PATH \
    SCA_CARGODENY_CHECKS \
    SCA_CARGODENY_FILE_FILTER \
    SCA_CARGODENY_SKIP_IDS \
    SCA_FILE_FILTER_EXTRA \
    SCA_LOCAL_FILE_FILTER \
"

python do_sca_cargodeny_report() {
    import os
    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cargodeny.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_cargodeny(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "cargodeny", get_fatal_entries(d, clean_split(d, "SCA_CARGODENY_EXTRA_FATAL"),
                        d.expand("${STAGING_DATADIR_NATIVE}/cargodeny-${SCA_MODE}-fatal")))
}

do_sca_cargodeny_report[vardeps] += "\
    SCA_CARGODENY_EXTRA_FATAL \
    SCA_CARGODENY_EXTRA_SUPPRESS \
    SCA_SCOPE_FILTER \
    SCA_SEVERITY_TRANSFORM \
    SCA_SUPPRESS_LOCALS \
"

# we need network for fetching the audit database
do_sca_cargodeny[network] = "1"
do_sca_cargodeny[doc] = "Audit Rust/Cargo projects"
do_sca_cargodeny_report[doc] = "Report findings of do_sca_cargodeny"
addtask do_sca_cargodeny after do_compile before do_sca_tracefiles
addtask do_sca_cargodeny_report after do_sca_tracefiles before do_sca_deploy

DEPENDS += "\
    cargo-native \
    advisory-db-native \
    rust-cargo-deny-native \
    sca-recipe-cargodeny-rules-native \
"
