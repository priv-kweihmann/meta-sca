SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220315194320-039c03cc5b86.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220315194320-039c03cc5b86;downloadfilename=golang-org-x-sys-0.0.0-20220315194320-039c03cc5b86.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "92f63e78b6852ea8b7039ea65fb6cf73977e30283057574071265c3d925c833a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

