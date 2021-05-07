SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20210503060354-a79de5458b56.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20210503060354-a79de5458b56;downloadfilename=golang-org-x-term-0.0.0-20210503060354-a79de5458b56.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "16078cc88bf2558c4856432edb6092b2285db325882c9f193af379a2de25d63a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
