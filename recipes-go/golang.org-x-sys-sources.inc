SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211210111614-af8b64212486.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211210111614-af8b64212486;downloadfilename=golang-org-x-sys-0.0.0-20211210111614-af8b64212486.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "2a250d8b0de456c701e2abc6ade76a4c6daff5a2213811053b333a2edd560908"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

