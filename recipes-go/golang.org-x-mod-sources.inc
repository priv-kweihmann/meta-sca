SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.18.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.18.0;downloadfilename=golang-org-x-mod-0.18.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "9c64a3efda43c92014675361b2620de1f2815d59875a379f0b3361018e5bdf59"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

