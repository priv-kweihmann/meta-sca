SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210910150752-751e447fb3d0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210910150752-751e447fb3d0;downloadfilename=golang-org-x-sys-0.0.0-20210910150752-751e447fb3d0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "eec81efd6ac1806d6ed65751f002eb416627f166e2c7d4ffa09e334c85d229b7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

