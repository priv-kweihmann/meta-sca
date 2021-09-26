SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210925032602-92d5a993a665.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210925032602-92d5a993a665;downloadfilename=golang-org-x-sys-0.0.0-20210925032602-92d5a993a665.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "eb4f88cca8ad22e871902e763b965210b18f8bf7f7be91a76ba03825db21809f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

