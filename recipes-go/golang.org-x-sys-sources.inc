SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.8.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.8.0;downloadfilename=golang-org-x-sys-0.8.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "2588b3a645838390e341f1007f8679f5e1117b5d5ac9467ef832d148b2219a38"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

