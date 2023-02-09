SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20230206171751-46f607a40771.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20230206171751-46f607a40771;downloadfilename=golang-org-x-exp-0.0.0-20230206171751-46f607a40771.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "945b5b1e1d67c7528a9112e2abd3a947c9196f9305953b9b9fb8a85466e48bcd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
