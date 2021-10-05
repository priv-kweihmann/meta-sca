SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211004093028-2c5d950f24ef.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211004093028-2c5d950f24ef;downloadfilename=golang-org-x-sys-0.0.0-20211004093028-2c5d950f24ef.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "0e2a2aeb329539e90a2dd25e2ff99cda9704dd0b81eacb4d02d1b7bc23ddb8d6"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

