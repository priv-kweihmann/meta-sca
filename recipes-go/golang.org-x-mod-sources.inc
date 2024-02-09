SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.15.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.15.0;downloadfilename=golang-org-x-mod-0.15.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "81c61d043854b5242ac4a9ff92fe3b275b033cc5ec32c46b46a40a143c1658e7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

