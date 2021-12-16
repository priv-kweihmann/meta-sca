SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211216021012-1d35b9e2eb4e.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211216021012-1d35b9e2eb4e;downloadfilename=golang-org-x-sys-0.0.0-20211216021012-1d35b9e2eb4e.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "8147411a8a85b5b444586e9ab4036e6693e48a9b8e08012eec3dab45f39b1494"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

