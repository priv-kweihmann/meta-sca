SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20210916214954-140adaaadfaf.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20210916214954-140adaaadfaf;downloadfilename=golang-org-x-term-0.0.0-20210916214954-140adaaadfaf.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "24d10e5c9b5a34b6f2544884dccc20c46e8a2227a3725caff185c8e0c36bdde9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
