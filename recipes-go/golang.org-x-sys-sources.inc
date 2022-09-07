SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220907062415-87db552b00fd.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220907062415-87db552b00fd;downloadfilename=golang-org-x-sys-0.0.0-20220907062415-87db552b00fd.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "5ac9a644ca2bb1b1e98197f101ace6ec3b739c36a69abb8557703d5ecbae2a11"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

