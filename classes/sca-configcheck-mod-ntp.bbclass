## File to take as ntpd config
SCA_CONFIGCHECK_ntp_CONFIGFILE ?= "/etc/ntp.conf"

def do_sca_configcheck_run_ntp(d):
    return ["/bin/sh", "-c", "[ ! -z $(which ntpd) ] && ntpd -c {} -n".format(d.getVar("SCA_CONFIGCHECK_ntp_CONFIGFILE"))]

def do_sca_configcheck_conv_ntp(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^.*\:\s+line\s+((?P<line1>\d+)\s+column\s+(?P<col>\d+)\s+(?P<msg1>.*))|(.*\:\s+ignoring\s+line\s+(?P<line2>\d+),\s+(?P<msg2>.*))"

    _findings = []

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File=d.getVar("SCA_CONFIGCHECK_ntp_CONFIGFILE"),
                                    Line=m.group("line1") or m.group("line2") or "1",
                                    Column=m.group("col") or "1",
                                    Message=m.group("msg1") or m.group("msg2"),
                                    ID="ntp",
                                    Severity="error")
            if suppress.Suppressed(g):
                continue
            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
        except Exception as exp:
            bb.note(str(exp))

    return _findings
