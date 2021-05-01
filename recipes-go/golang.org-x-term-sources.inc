SRC_URI += "https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20210429154555-c04ba851c2a4.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20210429154555-c04ba851c2a4;downloadfilename=golang-org-x-term-0.0.0-20210429154555-c04ba851c2a4.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "b487bb2cfa35699569469c52ce72e805db91e09eadefc676ceb59c7fdd0690d0"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-term-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
