SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.5.1.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.5.1;downloadfilename=golang-org-x-mod-0.5.1.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "8bed1489120e9428a64aca97c3a0d13065a33d1564593aae45e5c731c488f975"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-xerrors-sources.inc', '', 'golang.org-x-xerrors-sources.inc', d)}
