SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20220916125017-b168a2c6b86b.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20220916125017-b168a2c6b86b;downloadfilename=golang-org-x-exp-0.0.0-20220916125017-b168a2c6b86b.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "e799e0f4d8739a119d340845e82017fb9c6e395e5402e815e694d39b9be9e4ab"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
