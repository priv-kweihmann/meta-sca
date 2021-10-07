SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211007075335-d3039528d8ac.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211007075335-d3039528d8ac;downloadfilename=golang-org-x-sys-0.0.0-20211007075335-d3039528d8ac.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "70dfd9027ce7aedaf6c9eb4f28abadb68709991a8f80456d6707a4061ec8e8b1"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

