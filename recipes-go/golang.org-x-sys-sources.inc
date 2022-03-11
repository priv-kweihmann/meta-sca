SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220310020820-b874c991c1a5.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220310020820-b874c991c1a5;downloadfilename=golang-org-x-sys-0.0.0-20220310020820-b874c991c1a5.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "40383c39a44acb6a19e87b79b8ed525af81b94556526284a7d1db82b6cf1fca0"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

