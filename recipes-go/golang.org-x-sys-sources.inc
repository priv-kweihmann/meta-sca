SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220128215802-99c3d69c2c27.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220128215802-99c3d69c2c27;downloadfilename=golang-org-x-sys-0.0.0-20220128215802-99c3d69c2c27.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "e66e941a65cb14d452a4c555dcdcce5aefab026d56e090567a89280eff3cd921"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

