SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220224120231-95c6836cb0e7.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220224120231-95c6836cb0e7;downloadfilename=golang-org-x-sys-0.0.0-20220224120231-95c6836cb0e7.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "459b9c6f4b69b055937560629e93a90ebbd36dea687017f5ce33a130635c83d6"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

