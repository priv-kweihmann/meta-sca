SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20230118134722-a68e582fa157.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20230118134722-a68e582fa157;downloadfilename=golang-org-x-exp-0.0.0-20230118134722-a68e582fa157.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "0cec44a9a49945b0a4518f7f6e180392a1c5de7891fcc7d0ba666ebec28727e8"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
