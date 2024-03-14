SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.18.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.18.0;downloadfilename=golang-org-x-term-0.18.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "60652f7dd2fa4185c62867bcaa3fa56e59b07f5b71083d8f72ab882d251355a6"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
