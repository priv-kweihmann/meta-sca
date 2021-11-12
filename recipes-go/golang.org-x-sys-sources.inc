SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211111213525-f221eed1c01e.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211111213525-f221eed1c01e;downloadfilename=golang-org-x-sys-0.0.0-20211111213525-f221eed1c01e.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "66128897d8f2c813634cdaacd6a51d19c9f035c03fd18872c9c83276e068cf9b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

