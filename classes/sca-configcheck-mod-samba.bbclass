## File to take as samba config
SCA_CONFIGCHECK_samba_CONFIGFILE ?= "/etc/samba/smb.conf"

def do_sca_configcheck_run_samba(d):
    return ["/bin/sh", "-c", "[ ! -z $(which testparm) ] && testparm -v -s {}".format(d.getVar("SCA_CONFIGCHECK_samba_CONFIGFILE"))]

def do_sca_configcheck_conv_samba(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^(set_variable_helper(?P<msg2>.*))|(Ignoring\s+(?P<msg3>.*))|((?P<severity>WARNING)\:\s+(?P<msg1>.*))"

    _findings = []

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File=d.getVar("SCA_CONFIGCHECK_samba_CONFIGFILE"),
                                    Message=m.group("msg1") or m.group("msg2") or m.group("msg3"),
                                    ID="samba",
                                    Severity="warning")
            if suppress.Suppressed(g):
                continue
            if g.Scope not in clean_split(d, "SCA_SCOPE_FILTER"):
                continue
            if g.Severity in sca_allowed_warning_level(d):
                _findings.append(g)
        except Exception as exp:
            bb.note(str(exp))

    return _findings
