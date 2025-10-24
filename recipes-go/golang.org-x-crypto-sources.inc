SRC_URI += "https://proxy.golang.org/golang.org/x/crypto/@v/v0.43.0.zip;srcoutput=golang.org/x/crypto;srcinput=golang.org/x/crypto@v0.43.0;downloadfilename=golang-org-x-crypto-0.43.0.zip;name=golang-org-x-crypto"
SRC_URI[golang-org-x-crypto.sha256sum] = "0b11e4f2ac759849fc2567213e22e7dcb2e1bfe9755aca46c95d8d253f3c610b"
GOSRC_REMOVEDIRS += "golang.org/x/crypto/internal/wycheproof"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/crypto/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-crypto-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
