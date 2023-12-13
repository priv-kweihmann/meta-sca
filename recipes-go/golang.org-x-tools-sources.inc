SRC_URI += "https://proxy.golang.org/golang.org/x/tools/@v/v0.16.1.zip;srcoutput=golang.org/x/tools;srcinput=golang.org/x/tools@v0.16.1;downloadfilename=golang-org-x-tools-0.16.1.zip;name=golang-org-x-tools"
SRC_URI[golang-org-x-tools.sha256sum] = "b3f3c12d493747930eee9054fdd7e35aa36fe2c6d4b2aac2e0c29801e9fc9516"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/tools/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
    file://src/golang.org/x/tools/cmd/getgo/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab \
"

GOSRC_INCLUDEGUARD += "golang.org-x-tools-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-yuin-goldmark-sources.inc', '', 'github.com-yuin-goldmark-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
