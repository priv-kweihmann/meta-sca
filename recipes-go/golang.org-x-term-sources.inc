SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20210927222741-03fcf44c2211.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20210927222741-03fcf44c2211;downloadfilename=golang-org-x-term-0.0.0-20210927222741-03fcf44c2211.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "3adf713afa49fe26580ffe4adb1f4fb2f4921c945301aa5a9fb6d34031fa30cd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
