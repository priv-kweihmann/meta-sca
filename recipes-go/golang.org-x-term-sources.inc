SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.11.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.11.0;downloadfilename=golang-org-x-term-0.11.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "d9a79ecfb908333f03d7f3f4b597551a6916462c6c5d040528c9887df956600e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
