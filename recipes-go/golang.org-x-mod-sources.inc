SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.12.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.12.0;downloadfilename=golang-org-x-mod-0.12.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "79b7f79f68bc82dfd5de5f58c5a9b4750120bc1b15fb201a19f27f1d7fb4ef55"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

