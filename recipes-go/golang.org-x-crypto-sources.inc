SRC_URI += "https://proxy.golang.org/golang.org/x/crypto/@v/v0.0.0-20220112180741-5e0467b6c7ce.zip;srcoutput=golang.org/x/crypto;srcinput=golang.org/x/crypto@v0.0.0-20220112180741-5e0467b6c7ce;downloadfilename=golang-org-x-crypto-0.0.0-20220112180741-5e0467b6c7ce.zip;name=golang-org-x-crypto"
SRC_URI[golang-org-x-crypto.sha256sum] = "c8c5cf6be93366723efffb4d1a71dde0da4a77886186c890de1b6821ee30cb3d"
GOSRC_REMOVEDIRS += "golang.org/x/crypto/internal/wycheproof"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/crypto/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-crypto-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
