SRC_URI += "https://proxy.golang.org/golang.org/x/crypto/@v/v0.0.0-20211215165025-cf75a172585e.zip;srcoutput=golang.org/x/crypto;srcinput=golang.org/x/crypto@v0.0.0-20211215165025-cf75a172585e;downloadfilename=golang-org-x-crypto-0.0.0-20211215165025-cf75a172585e.zip;name=golang-org-x-crypto"
SRC_URI[golang-org-x-crypto.sha256sum] = "9d05ed916d258196c266f17d5e8fecb241141b157497f34da9bae6e83ea2eb37"
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
