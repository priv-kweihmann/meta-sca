SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.1.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.1.0;downloadfilename=golang-org-x-sys-0.1.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "e7cbe58ed3745ba63d482fe82603119bd635f9a5dd914ed95a4c1826fdcf54a7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

