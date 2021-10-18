SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211015200801-69063c4bb744.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211015200801-69063c4bb744;downloadfilename=golang-org-x-sys-0.0.0-20211015200801-69063c4bb744.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "e9ec3bd64ff061b4ed183b383263994877808c0c07c02204fd8266aa61100757"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

