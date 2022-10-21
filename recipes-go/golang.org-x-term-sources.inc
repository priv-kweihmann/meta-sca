SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20221017184919-83659145692c.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20221017184919-83659145692c;downloadfilename=golang-org-x-term-0.0.0-20221017184919-83659145692c.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "43f4627bcafb669ad3fae294df017466e200c677a0a8a645d5b788b7cf566eb8"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
