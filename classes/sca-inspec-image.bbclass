## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

SCA_INSPEC_EXTRA_SUPPRESS ?= ""
SCA_INSPEC_EXTRA_FATAL ?= ""
SCA_RAW_RESULT_FILE[inspec] = "json"

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-license-filter
inherit sca-crossemu
inherit sca-suppress
inherit sca-image-backtrack
inherit sca-inspec-config

DEPENDS += "inspec-sca-native sca-image-inspec-rules-native packagegroup-inspec-profiles"

def do_sca_conv_inspec(d):
    import os
    import json

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _suppress = sca_suppress_init(d, "SCA_INSPEC_EXTRA_SUPPRESS",
                                  d.expand("${STAGING_DATADIR_NATIVE}/inspec-${SCA_MODE}-suppress"))
    _findings = []

    if os.path.exists(sca_raw_result_file(d, "inspec")):
        with open(sca_raw_result_file(d, "inspec"), "r") as f:
            try:
                _content = json.load(f)
                for p in _content["profiles"]:
                    for c in p["controls"]:
                        _id = c["id"]
                        for r in c["results"]:
                            if r["status"] != "failed":
                                continue
                            _m = r["code_desc"] if "code_desc" in r else None
                            if not _m:
                                _m = r["message"] 
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="inspec",
                                                    BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                                    File=d.getVar("FILE"),
                                                    Message=_m.replace("\n", " "),
                                                    ID=_id,
                                                    Severity="warning")
                            if _suppress.Suppressed(g):
                                continue
                            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings += sca_backtrack_findings(d, g)
            except Exception as exp:
                bb.warn(str(exp))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

fakeroot python do_sca_inspec() {
    import os
    import subprocess

    # create root first
    _, _ = sca_crossemu(d, [], ["packagegroup-inspec-profiles"], "inspec", ";")
    cmd_output = '{"profiles": []}'
    for mod in clean_split(d, "SCA_INSPEC_MODULES"):
        _args = ["/bin/sh", "-c",
                 "GEM_PATH=/usr/lib/ruby/site_ruby:/usr/lib/ruby/gems inspec exec --no-interactive "
                 "--no-enable-telemetry --chef-license=accept-no-persist " +
                 "/usr/share/inspec/profiles/{}/".format(mod) + " --reporter json:-"]
        _tmp, _ = sca_crossemu(d, _args, [], "inspec", ";", nocreateroot=True)
        _tmp = _tmp.decode("utf-8")
        _tmp = _tmp[_tmp.find("{"):]
        cmd_output = exec_wrap_combine_json_subarray(cmd_output, _tmp, key="profiles")
    
    with open(sca_raw_result_file(d, "inspec"), "w") as o:
        o.write(cmd_output)

    # Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/inspec.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_inspec(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "inspec", get_fatal_entries(d, "SCA_INSPEC_EXTRA_FATAL",
                       d.expand("${STAGING_DATADIR_NATIVE}/inspec-${SCA_MODE}-fatal")))
}

do_sca_inspec[lockfiles] += "${WORKDIR}/crossemu.lock"
do_sca_inspec[doc] = "For overall compliance with inspec profiles"
addtask do_sca_inspec before do_sca_deploy after do_image
