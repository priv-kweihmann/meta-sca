SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220730100132-1609e554cd39.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220730100132-1609e554cd39;downloadfilename=golang-org-x-sys-0.0.0-20220730100132-1609e554cd39.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "4c9dd1dcfdd32b0ad8a500bd7846054bfd480b0f03627d248298960850ef89b5"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

