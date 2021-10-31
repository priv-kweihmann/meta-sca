SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211031064116-611d5d643895.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211031064116-611d5d643895;downloadfilename=golang-org-x-sys-0.0.0-20211031064116-611d5d643895.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "d4772e005a59db9180254e0052f5fdb24ae5cc2121e18d4b7e6e7bac8e5ce831"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

