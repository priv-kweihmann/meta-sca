SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.21.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.21.0;downloadfilename=golang-org-x-sys-0.21.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "2588f4e77c83774bc6f168e8594f2dcbd21c1d26849a877f7e6a0d151392e735"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

