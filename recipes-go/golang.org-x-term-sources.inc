SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20220722155259-a9ba230a4035.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20220722155259-a9ba230a4035;downloadfilename=golang-org-x-term-0.0.0-20220722155259-a9ba230a4035.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "56fa4c44da3c61a77a894a9d5fa5603e0d203ca1cc23ec1f42d4e9fcfbd4c53b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
