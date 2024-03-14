SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.16.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.16.0;downloadfilename=golang-org-x-mod-0.16.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "44bb0b60a305036c6402f9b2d58f7d3cfca310cff57241f37c6e0a6bdafacb15"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

