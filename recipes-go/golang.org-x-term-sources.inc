SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20210421210424-b80969c67360.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20210421210424-b80969c67360;downloadfilename=golang-org-x-term-0.0.0-20210421210424-b80969c67360.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "b25d63c116d8f395214e4006fefc8cce591f78c4a90af0eea9531a5325a9ff3a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
