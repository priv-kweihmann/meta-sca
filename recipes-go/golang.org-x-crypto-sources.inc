SRC_URI += "https://proxy.golang.org/golang.org/x/crypto/@v/v0.31.0.zip;srcoutput=golang.org/x/crypto;srcinput=golang.org/x/crypto@v0.31.0;downloadfilename=golang-org-x-crypto-0.31.0.zip;name=golang-org-x-crypto"
SRC_URI[golang-org-x-crypto.sha256sum] = "7cbc5fbc206b07db3c691ad59bc1b31f2c32a1dae2b04c9a7772f93a696381bf"
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
