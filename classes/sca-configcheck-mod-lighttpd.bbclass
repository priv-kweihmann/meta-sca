## File to take as lighttpd config
SCA_CONFIGCHECK_lighttpd_CONFIGFILE ?= "/etc/lighttpd/lighttpd.conf"

def do_sca_configcheck_run_lighttpd(d):
    return ["/bin/sh", "-c", "[ ! -z $(which lighttpd) ] && lighttpd -t -f {}".format(d.getVar("SCA_CONFIGCHECK_lighttpd_CONFIGFILE"))]

def do_sca_configcheck_conv_lighttpd(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^.*\s+source\:\s+(?P<file>.*)\s+line\:\s+(?P<line>\d+)\s+pos\:\s+(?P<col>\d+)\s+(?P<msg>.*)"

    _findings = []

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File=m.group("file"),
                                    Line=m.group("line"),
                                    Column=m.group("col"),
                                    Message=m.group("msg"),
                                    ID="lighttpd",
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
