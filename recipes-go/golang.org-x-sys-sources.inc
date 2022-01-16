SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220114195835-da31bd327af9.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220114195835-da31bd327af9;downloadfilename=golang-org-x-sys-0.0.0-20220114195835-da31bd327af9.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "fb13b0dba0243fd6f93c0f31e0ab553bfc7f4b9b098b38bdf917142156745bc0"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

