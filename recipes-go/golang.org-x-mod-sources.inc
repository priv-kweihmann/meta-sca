SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.10.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.10.0;downloadfilename=golang-org-x-mod-0.10.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "f876473ac27f1c6e3b0fff971c84fbebcf670db0b3e8f281e03149fcf636fe25"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

