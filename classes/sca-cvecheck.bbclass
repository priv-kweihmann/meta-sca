## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit cve-check
inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress
inherit sca-image-backtrack

# override some variables till an upstream fix is available
CVE_CHECK_DB_DIR = "${TOPDIR}/downloads/CVE_CHECK"
CVE_CHECK_DB_DIR[vardepsexclude] += "TOPDIR"

SCA_RAW_RESULT_FILE[cvecheck] = "json"

python sca_cvecheck_init() {
    ## Move the do_cve_check from before do_build to before do_package_qa
    _flags = d.getVarFlag("do_build", "deps")
    if "do_cve_check" in _flags:
        _flags.remove("do_cve_check")
    d.setVarFlag("do_build", "deps", _flags)
    d.appendVarFlag("do_package_qa", "depends", " {}:{}".format(d.getVar("PN"), "do_cve_check"))
}

def sca_create_data_file(d, cve_data):
    import os
    """
    Write CVE information in WORKDIR; and to CVE_CHECK_DIR, and
    CVE manifest if enabled.
    """
    nvd_link = "https://web.nvd.nist.gov/view/vuln/detail?vulnId="

    package_name = d.getVar("PN")
    _suppress = sca_suppress_init(d, clean_split(d, ""), None, file_trace=False)
    _findings = []

    for cve in sorted(cve_data):
        if cve_is_patched(d, cve_data, cve):
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
            _findings += sca_backtrack_findings(d, g)

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_cve_check() {
    """
    Check recipe for patched and unpatched CVEs
    """

    try:
        # starting in mickledore, get_patches_cves() moved to library and was renamed
        from oe.cve_check import get_patched_cves
    except Exception as e:
        # otherwise should still be in cve-check bbclass but with old name
        get_patched_cves = get_patches_cves

    if os.path.exists(d.getVar("CVE_CHECK_DB_FILE")):
        patched_cves = get_patched_cves(d)
        _data, _ = check_cves(d, patched_cves)
        if _data:
            get_cve_info(d, _data)

            output = sca_create_data_file(d, _data)
        else:
            output = sca_create_data_file(d, [])
    else:
        output = sca_create_data_file(d, [])
        bb.note("Failed to update CVE database, skipping CVE check")

    with open(sca_raw_result_file(d, "cvecheck"), "w") as o:
        o.write(output)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cvecheck.dm".format(d.getVar("T")))
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(output)

    sca_task_aftermath(d, "cvecheck")
}

do_cve_check[vardeps] += "\
    SCA_SCOPE_FILTER \
    SCA_SEVERITY_TRANSFORM \
    SCA_SUPPRESS_LOCALS \
"

do_sca_deploy[depends] += "${PN}:do_cve_check"

DEPENDS += "cvecheck-sca-native"
