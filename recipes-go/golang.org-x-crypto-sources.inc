SRC_URI += "https://proxy.golang.org/golang.org/x/crypto/@v/v0.0.0-20210506145944-38f3c27a63bf.zip;srcoutput=golang.org/x/crypto;srcinput=golang.org/x/crypto@v0.0.0-20210506145944-38f3c27a63bf;downloadfilename=golang-org-x-crypto-0.0.0-20210506145944-38f3c27a63bf.zip;name=golang-org-x-crypto"
SRC_URI[golang-org-x-crypto.sha256sum] = "6150c454f62946af755f9412b3ecf7a04aa6444a8fd2548d30660a1a7fd35f12"
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
