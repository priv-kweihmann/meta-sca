SRC_URI += "git://github.com/ProtonMail/go-crypto;nobranch=1;protocol=https;srcinput=github.com/ProtonMail/go-crypto;srcoutput=github.com/ProtonMail/go-crypto;destsuffix=github.com/ProtonMail/go-crypto;name=github-com-protonmail-go-crypto"
SRCREV_github-com-protonmail-go-crypto = "c05353c2d58c90ebc6e81dfabef7e3ba48137059"
GOSRC_REMOVEDIRS += "github.com/ProtonMail/go-crypto/openpgp/integration_tests"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ProtonMail/go-crypto/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "github.com-protonmail-go-crypto-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
