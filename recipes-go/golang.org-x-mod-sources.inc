SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.19.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.19.0;downloadfilename=golang-org-x-mod-0.19.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "f98b5d576225d13dac6945afc53bc79cb66ad3ebd9a4eacdefbf629f4d20ea44"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

