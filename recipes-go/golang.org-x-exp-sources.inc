SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20221111204811-129d8d6c17ab.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20221111204811-129d8d6c17ab;downloadfilename=golang-org-x-exp-0.0.0-20221111204811-129d8d6c17ab.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "3d3f84a58f2e24fb3bbbd7c1fc7c422d257e6e006bd08925d0cbecf6e24e7e4f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
