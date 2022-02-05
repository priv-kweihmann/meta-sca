SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220204135822-1c1b9b1eba6a.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220204135822-1c1b9b1eba6a;downloadfilename=golang-org-x-sys-0.0.0-20220204135822-1c1b9b1eba6a.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "c73254a15ec3b2db567fd59c2d03ae0f9279250a9309c7eac320c3a7a8516419"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

