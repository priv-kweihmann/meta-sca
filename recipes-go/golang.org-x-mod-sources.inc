SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.9.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.9.0;downloadfilename=golang-org-x-mod-0.9.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "ad0b72a29c07f57d92612fdbc2da6891b3988dd98b31d2fdcbe8ddb9c8cc2d52"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

