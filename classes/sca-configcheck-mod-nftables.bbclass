## Path to base dir where to look for nftables includes
SCA_CONFIGCHECK_nftables_INCLUDEDIR ?= "/etc/nft/rules"
## Glob where to look for nftables-rules
SCA_CONFIGCHECK_nftables_FILEGLOB ?= "/etc/nft/rules/*"

def do_sca_configcheck_run_nftables(d):
    return ["/bin/sh", "-c", "[ ! -z $(which nft) ] && for f in {};do nft -c -I {} -f $f; done".format(d.getVar("SCA_CONFIGCHECK_nftables_FILEGLOB"), d.getVar("SCA_CONFIGCHECK_nftables_INCLUDEDIR"))]

def do_sca_configcheck_conv_nftables(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*):(?P<line>\d+):(?P<col>\d+)-\d+:\s+(?P<severity>.*):\s+(?P<msg>.*)"

    _findings = []

    severity_map = {
        "Error" : "error",
        "Warning": "warning"
    }

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File=m.group("file"),
                                    Line=m.group("line"),
                                    Column=m.group("col"),
                                    Message=m.group("msg").strip(),
                                    ID="nftables",
                                    Severity=severity_map[m.group("severity")])
            if suppress.Suppressed(g):
                continue
            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
        except Exception as exp:
            bb.note(str(exp))

    return _findings
