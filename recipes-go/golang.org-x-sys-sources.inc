SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210503173754-0981d6026fa6.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210503173754-0981d6026fa6;downloadfilename=golang-org-x-sys-0.0.0-20210503173754-0981d6026fa6.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "acf430d1e09a4df35f8b3e77d72c7a45226a99b2ec401001ce2590b4e7713a86"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

