SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20220518171630-0b5c67f07fdf.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20220518171630-0b5c67f07fdf;downloadfilename=golang-org-x-exp-0.0.0-20220518171630-0b5c67f07fdf.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "7e649a592bb0b420ad8af83ce92c9b4c19e10a17c77b37feea04658cc2f162a9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
