SRC_URI += "https://proxy.golang.org/golang.org/x/crypto/@v/v0.0.0-20220513210258-46612604a0f9.zip;srcoutput=golang.org/x/crypto;srcinput=golang.org/x/crypto@v0.0.0-20220513210258-46612604a0f9;downloadfilename=golang-org-x-crypto-0.0.0-20220513210258-46612604a0f9.zip;name=golang-org-x-crypto"
SRC_URI[golang-org-x-crypto.sha256sum] = "01e0385e8e2ff7af02e89a4cf3bbce048a9048949899020e6df0180bd3aef656"
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
