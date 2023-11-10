SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.14.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.14.0;downloadfilename=golang-org-x-term-0.14.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "ee6eca1965d6b7d74f15c6f721eac7f3a35dced1e88cd6297e696b0067934f4b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
