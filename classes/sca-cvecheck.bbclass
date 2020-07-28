## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit cve-check
inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

# override some variables till an upstream fix is available
CVE_CHECK_DB_DIR = "${TOPDIR}/downloads/CVE_CHECK"

SCA_RAW_RESULT_FILE[cvecheck] = "json"

python sca_cvecheck_init() {
    ## Move the do_cve_check from before do_build to before do_package_qa
    _flags = d.getVarFlag("do_build", "deps")
    if "do_cve_check" in _flags:
        _flags.remove("do_cve_check")
    d.setVarFlag("do_build", "deps", _flags)
    d.appendVarFlag("do_package_qa", "depends", " {}:{}".format(d.getVar("PN"), "do_cve_check"))
}

def sca_create_data_file(d, patched, unpatched, cve_data):
    import os
    """
    Write CVE information in WORKDIR; and to CVE_CHECK_DIR, and
    CVE manifest if enabled.
    """

    cve_file = d.getVar("CVE_CHECK_LOG")
    nvd_link = "https://web.nvd.nist.gov/view/vuln/detail?vulnId="
    write_string = ""
    unpatched_cves = []
    bb.utils.mkdirhier(os.path.dirname(cve_file))

    package_name = d.getVar("PN")
    _suppress = sca_suppress_init(d, "", None, file_trace=False)
    items = []
    _findings = []

    for cve in sorted(cve_data):
        if cve in patched:
            continue
        g = sca_get_model_class(d,
                                PackageName=package_name,
                                Tool="cvecheck",
                                BuildPath=sca_get_layer_path_for_file(d, d.getVar("FILE")),
                                File=d.getVar("FILE"),
                                Message="{},Score={},Url={}".format(cve_data[cve]["summary"], cve_data[cve]["scorev3"], nvd_link, cve),
                                ID="cvecheck.unpatched",
                                Severity="error")
        if _suppress.Suppressed(g):
            continue
        if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
            continue
        if g.Severity in sca_allowed_warning_level(d):
            _findings.append(g)

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_cve_check() {
    """
    Check recipe for patched and unpatched CVEs
    """

    if os.path.exists(d.getVar("CVE_CHECK_DB_FILE")):
        patched_cves = get_patches_cves(d)
        _, patched, unpatched = check_cves(d, patched_cves)
        if patched or unpatched:
            cve_data = get_cve_info(d, patched + unpatched)

            output = sca_create_data_file(d, patched, unpatched, cve_data)
        else:
            output = sca_create_data_file(d, [], [], [])
    else:
        output = sca_create_data_file(d, [], [], [])
        bb.note("Failed to update CVE database, skipping CVE check")

    with open(sca_raw_result_file(d, "cvecheck"), "w") as o:
        o.write(output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cvecheck.dm".format(d.getVar("T")))
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(output)

    sca_task_aftermath(d, "cvecheck")
}

SCA_DEPLOY_TASK = "do_sca_deploy_cvecheck"

python do_sca_deploy_cvecheck() {
    sca_conv_deploy(d, "cvecheck")
}

do_sca_deploy_cvecheck[doc] = "Deploy results of do_cve_check"
addtask do_sca_deploy_cvecheck after do_cve_check before do_package

DEPENDS += "cvecheck-sca-native"
