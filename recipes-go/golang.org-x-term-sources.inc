SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.21.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.21.0;downloadfilename=golang-org-x-term-0.21.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "3ba59c5c929c526e0bf016696db8ffec313b43876428677ecda4198312a6f696"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
