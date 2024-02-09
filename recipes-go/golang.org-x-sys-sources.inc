SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.17.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.17.0;downloadfilename=golang-org-x-sys-0.17.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "b49fb9baa2cd133596927ef070ce74bf38223d97e7c81ef73fe1e8b2ab3639cd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

