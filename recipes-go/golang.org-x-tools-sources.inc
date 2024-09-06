SRC_URI += "https://proxy.golang.org/golang.org/x/tools/@v/v0.24.0.zip;srcoutput=golang.org/x/tools;srcinput=golang.org/x/tools@v0.24.0;downloadfilename=golang-org-x-tools-0.24.0.zip;name=golang-org-x-tools"
SRC_URI[golang-org-x-tools.sha256sum] = "92607be1cacf4647fd31b19ee64b1a7c198178f1005c75371e38e7b08fb138e7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/tools/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-tools-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-yuin-goldmark-sources.inc', '', 'github.com-yuin-goldmark-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-telemetry-sources.inc', '', 'golang.org-x-telemetry-sources.inc', d)}
