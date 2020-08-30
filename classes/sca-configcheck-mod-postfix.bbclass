## File to take as postfix config
SCA_CONFIGCHECK_postfix_CONFIGDIR ?= "/etc/postfix/"

def do_sca_configcheck_run_postfix(d):
    return ["/bin/sh", "-c", "[ ! -z $(which postfix) ] && postfix -c {} check".format(d.getVar("SCA_CONFIGCHECK_postfix_CONFIGDIR"))]

def do_sca_configcheck_conv_postfix(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^.*\:\s+(?P<severity>warning|fatal)\:\s+(((?P<file>.*)\:\s+(?P<msg1>.*\:.*))|(?P<msg2>.*))"

    _findings = []

    _severity_map = {
        "warning": "warning",
        "fatal": "error"
    }

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File=m.group("file") or d.getVar("SCA_CONFIGCHECK_postfix_CONFIGDIR"),
                                    Message=m.group("msg1") or m.group("msg2"),
                                    ID="postfix",
                                    Severity=_severity_map[m.group("severity")])
            # ignore the LC_ALL message as they don't come from the tool
            if g.Message.startswith("LC_ALL"):
                continue
            if suppress.Suppressed(g):
                continue
            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
        except Exception as exp:
            bb.note(str(exp))

    return _findings
