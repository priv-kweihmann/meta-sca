SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220408201424-a24fb2fb8a0f.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220408201424-a24fb2fb8a0f;downloadfilename=golang-org-x-sys-0.0.0-20220408201424-a24fb2fb8a0f.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "26fc15897b9bffa7979a9955a1ae75fc48ac35d56c983b2371d924fc55c8a4eb"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

