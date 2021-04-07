SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20210406210042-72f3dc4e9b72.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20210406210042-72f3dc4e9b72;downloadfilename=golang-org-x-term-0.0.0-20210406210042-72f3dc4e9b72.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "83df70bf45f7f9288cf1b07de19040c5d872f481ad7c17c69d1ffaf07a41dc89"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
