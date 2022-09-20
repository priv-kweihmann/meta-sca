SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20220919170432-7a66f970e087.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20220919170432-7a66f970e087;downloadfilename=golang-org-x-term-0.0.0-20220919170432-7a66f970e087.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "6ac2cd9f8fd8db0fe3e5380b727867c42e7f7983730aab77694a257ba10fe765"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
