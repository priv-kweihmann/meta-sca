SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.16.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.16.0;downloadfilename=golang-org-x-term-0.16.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "83ef4af9d349065d0a05559b033bf384cfc2b2b0b66fc2bdf2a094bd0fc4858f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
