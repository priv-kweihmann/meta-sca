SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.15.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.15.0;downloadfilename=golang-org-x-term-0.15.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "cb7fff77d2925dc0e4f5ac0ced38d10683824de81aae3728c633a9f7382d2052"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
