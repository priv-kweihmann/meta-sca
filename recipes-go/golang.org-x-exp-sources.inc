SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20220516143420-24438e51023a.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20220516143420-24438e51023a;downloadfilename=golang-org-x-exp-0.0.0-20220516143420-24438e51023a.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "90105904fee6fbc550ab026bb775d8cc61c94238bd3f5574a55b15d46f77df6c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
