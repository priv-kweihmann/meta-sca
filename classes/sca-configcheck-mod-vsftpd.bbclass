def do_sca_configcheck_run_vsftpd(d):
    return ["/bin/sh", "-c", "[ ! -z $(which vsftpd) ] && vsftpd -olisten=NO"]

def do_sca_configcheck_conv_vsftpd(d, toolout, suppress):
    import os
    import re

    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    pattern = r"^500\sOOPS\:\s+(?P<msg>.*)"

    _findings = []

    for m in re.finditer(pattern, toolout, re.MULTILINE):
        try:
            g = sca_get_model_class(d,
                                    PackageName=package_name,
                                    Tool="configcheck",
                                    BuildPath=buildpath,
                                    File="/etc/vsftpd.conf",
                                    Message=m.group("msg"),
                                    ID="vsftpd",
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
