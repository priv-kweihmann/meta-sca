## Path of used nginx config
SCA_CONFIGCHECK_nginx_CONFIGFILE ?= "/etc/nginx/nginx.conf"

def do_sca_configcheck_run_nginx(d):
    return ["/bin/sh", "-c", "[ ! -z $(which nginx) ] && nginx -T -c {}".format(d.getVar("SCA_CONFIGCHECK_nginx_CONFIGFILE"))]

def do_sca_configcheck_conv_nginx(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(nginx:|.*)\s+\[(?P<severity>.*)\]\s+(?P<msg>.*)\s+in\s+(?P<file>.*):(?P<line>\d+)"

    severity_map = {
        "emerg" : "error",
    }

    _findings = []

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File=m.group("file"),
                                    Line=m.group("line"),
                                    Message=m.group("msg").strip(),
                                    ID="nginx",
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
