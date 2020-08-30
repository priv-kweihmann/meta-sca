## Path of used sshd config
SCA_CONFIGCHECK_sshd_CONFIGFILE ?= "/etc/ssh/sshd_config"

def do_sca_configcheck_run_sshd(d):
    return ["/bin/sh", "-c", "[ ! -z $(which sshd) ] && /usr/libexec/openssh/sshd_check_keys && sshd -T -f {}".format(d.getVar("SCA_CONFIGCHECK_sshd_CONFIGFILE"))]

def do_sca_configcheck_conv_sshd(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(?P<file>.*)\s+line\s+(?P<line>\d+):\s+(?P<msg>.*)"

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
                                    ID="sshd",
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
