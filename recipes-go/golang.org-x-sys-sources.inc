SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210630005230-0f9fa26af87c.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210630005230-0f9fa26af87c;downloadfilename=golang-org-x-sys-0.0.0-20210630005230-0f9fa26af87c.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "e28dd0a068bd7e9257a9f194e4b00bef0a37b83d5b10333ee001515cbd0bec1d"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

