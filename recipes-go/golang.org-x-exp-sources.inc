SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20220608143224-64259d1afd70.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20220608143224-64259d1afd70;downloadfilename=golang-org-x-exp-0.0.0-20220608143224-64259d1afd70.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "d1e7df46f6f3931af267fa81dbf05bea307331a7d561e2456cf5f5d54c1c807a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
