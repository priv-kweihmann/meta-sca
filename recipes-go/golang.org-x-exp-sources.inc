SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20230420155640-133eef4313cb.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20230420155640-133eef4313cb;downloadfilename=golang-org-x-exp-0.0.0-20230420155640-133eef4313cb.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "4b2fda185acec9faf86e9f6f26ebae42500267c55d0073540e33a18cddc6bf42"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
