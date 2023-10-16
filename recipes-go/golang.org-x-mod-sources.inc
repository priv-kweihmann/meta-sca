SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.13.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.13.0;downloadfilename=golang-org-x-mod-0.13.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "1f8f0395c5372ff49b925658e0cfe3a288a1a2dc9193b7662e187fdeba9cb168"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

