SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220327210214-530d0810a4d0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220327210214-530d0810a4d0;downloadfilename=golang-org-x-sys-0.0.0-20220327210214-530d0810a4d0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "99a29a93a485d7b45a7a4fe931230f909283f722d2f4c20ebbbad1cdbcea434b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

