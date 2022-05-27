SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20220526004731-065cf7ba2467.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20220526004731-065cf7ba2467;downloadfilename=golang-org-x-term-0.0.0-20220526004731-065cf7ba2467.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "ae931b0b997490d6b1b7d73fe2c05c24ef9207c0669d5ab7f2cdff9d3279bb85"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
