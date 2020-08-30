## File to take as squid config
SCA_CONFIGCHECK_squid_CONFIGFILE ?= "/etc/squid/squid.conf"

def do_sca_configcheck_run_squid(d):
    return ["/bin/sh", "-c", "[ ! -z $(which squid) ] && squid -k parse -f {}".format(d.getVar("SCA_CONFIGCHECK_squid_CONFIGFILE"))]

def do_sca_configcheck_conv_squid(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^.*\|\s+(?P<severity>ERROR|WARNING|FATAL):\s+((Bungled\s+(?P<file>.*)\s+line\s(?P<line>\d+)\:\s+(?P<msg1>.*))|(?P<msg2>.*))"

    _findings = []
    _severity_map = {
        "ERROR": "error",
        "FATAL": "error",
        "WARNING": "warning"
    }

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File=m.group("file") or d.getVar("SCA_CONFIGCHECK_squid_CONFIGFILE"),
                                    Line=m.group("line") or "1",
                                    Message=m.group("msg1") or m.group("msg2"),
                                    ID="squid",
                                    Severity=_severity_map[m.group("severity")])
            if suppress.Suppressed(g):
                continue
            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
        except Exception as exp:
            bb.note(str(exp))

    return _findings
