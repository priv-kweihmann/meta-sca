SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20220927162542-c76eaa363f9d.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20220927162542-c76eaa363f9d;downloadfilename=golang-org-x-exp-0.0.0-20220927162542-c76eaa363f9d.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "56ebc8b69f98c7e7fd4d72589ae79ee949a87cdb6ac9ca0c01414ae1cfeda8e6"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
