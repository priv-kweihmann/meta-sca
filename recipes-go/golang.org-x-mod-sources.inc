SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.17.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.17.0;downloadfilename=golang-org-x-mod-0.17.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "a72fe5b79554a8993df9512d05e237908d3ad0b48001c1ab92b7fa5339ecf440"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

