SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.4.2.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.4.2;downloadfilename=golang-org-x-mod-0.4.2.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "39bc9b1570666300ba5c86244621ffbcc63b007ce69e6b7a46ffba7691929621"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-xerrors-sources.inc', '', 'golang.org-x-xerrors-sources.inc', d)}
