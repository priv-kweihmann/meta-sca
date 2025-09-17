SRC_URI += "https://proxy.golang.org/golang.org/x/tools/@v/v0.37.0.zip;srcoutput=golang.org/x/tools;srcinput=golang.org/x/tools@v0.37.0;downloadfilename=golang-org-x-tools-0.37.0.zip;name=golang-org-x-tools"
SRC_URI[golang-org-x-tools.sha256sum] = "429b25131b8564084cce722043b12dd8e3ff5231ac6cd63a405b4f3e6fd69204"

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
