SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.9.0.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.9.0;downloadfilename=golang-org-x-term-0.9.0.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "b4e6d2ac97732625eee581f47fe4a2125dd8668fe285794bac1a9a1a7fd3f1e3"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
