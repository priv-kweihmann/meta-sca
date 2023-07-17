SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.10.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.10.0;downloadfilename=golang-org-x-term-0.10.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "bd45e8e1dcd4bea092f0881aa1df3e472db10c3a002bb8ba126857cb24b6d72e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
