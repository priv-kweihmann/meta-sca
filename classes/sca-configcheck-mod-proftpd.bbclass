## File to take as proftpd config
SCA_CONFIGCHECK_proftpd_CONFIGFILE ?= "/etc/proftpd.conf"

def do_sca_configcheck_run_proftpd(d):
    return ["/bin/sh", "-c", "[ ! -z $(which proftpd) ] && proftpd -c {} -t".format(d.getVar("SCA_CONFIGCHECK_proftpd_CONFIGFILE"))]

def do_sca_configcheck_conv_proftpd(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^.*(?P<severity>fatal)\:\s+(?P<msg>.*)\s+on\s+line\s+(?P<line>\d+)\s+of\s+\'(?P<file>.*)\'"

    _findings = []

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File=m.group("file"),
                                    Line=m.group("line"),
                                    Message=m.group("msg"),
                                    ID="proftpd",
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
