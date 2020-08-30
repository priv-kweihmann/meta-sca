def do_sca_configcheck_run_freeradius(d):
    return ["/bin/sh", "-c", "[ ! -z $(which radiusd) ] && mkdir -p /tmp && radiusd -C -l /tmp/radius_check; cat /tmp/radius_check"]

def do_sca_configcheck_conv_freeradius(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^.*:\s+(?P<severity>Error|Warning):\s*\[(?P<file>.*)\]:(?P<line>\d+)\s+(?P<msg>.*)"

    severity_map = {
        "Error" : "error",
        "Warning": "warning"
    }

    _findings = []

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    Line=m.group("line"),
                                    File=m.group("file"),
                                    Message=m.group("msg").strip(),
                                    ID="freeradius",
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
