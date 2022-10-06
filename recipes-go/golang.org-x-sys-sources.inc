SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220928140112-f11e5e49a4ec.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220928140112-f11e5e49a4ec;downloadfilename=golang-org-x-sys-0.0.0-20220928140112-f11e5e49a4ec.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "6532acc65e10d1ea772a63da4365d6ee9be9359554eaef7aaa10cd411a9a6500"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

