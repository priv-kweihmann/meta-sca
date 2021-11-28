SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211124211545-fe61309f8881.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211124211545-fe61309f8881;downloadfilename=golang-org-x-sys-0.0.0-20211124211545-fe61309f8881.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "c86c2740314050cde72d082af66b4b142ae7e263903a9c17a43b9e799504567c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

