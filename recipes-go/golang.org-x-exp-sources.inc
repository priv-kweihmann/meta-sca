SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20220428152302-39d4317da171.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20220428152302-39d4317da171;downloadfilename=golang-org-x-exp-0.0.0-20220428152302-39d4317da171.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "dda3d8504004ef0954ca9d75b8de5d5af1ea9abc7d8481b7a3f2a3355b0e7a9a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
