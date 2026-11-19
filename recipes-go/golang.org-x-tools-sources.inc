SRC_URI += "https://proxy.golang.org/golang.org/x/tools/@v/v0.53.0.zip;srcoutput=golang.org/x/tools;srcinput=golang.org/x/tools@v0.53.0;downloadfilename=golang-org-x-tools-0.53.0.zip;name=golang-org-x-tools"
SRC_URI[golang-org-x-tools.sha256sum] = "8709a234f7409f076fe077d6ff68952202a7a238b7212d094458efe988e7861c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/tools/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-tools-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-yuin-goldmark-sources.inc', '', 'github.com-yuin-goldmark-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-telemetry-sources.inc', '', 'golang.org-x-telemetry-sources.inc', d)}
