SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220817070843-5a390386f1f2.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220817070843-5a390386f1f2;downloadfilename=golang-org-x-sys-0.0.0-20220817070843-5a390386f1f2.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "8dfdf201fcc5c2ecc4d284d1716276ee4874b9f3011061cef2e1d018d617b440"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

