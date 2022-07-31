SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20220722155223-a9213eeb770e.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20220722155223-a9213eeb770e;downloadfilename=golang-org-x-exp-0.0.0-20220722155223-a9213eeb770e.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "a3ee863b5ea60e97d613e228cae675b180072d154dfa347cc7afaee313687123"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
