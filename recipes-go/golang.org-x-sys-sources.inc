SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210608053332-aa57babbf139.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210608053332-aa57babbf139;downloadfilename=golang-org-x-sys-0.0.0-20210608053332-aa57babbf139.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "0d13472ebbcd1bda09ccf2f95773ce6ab857ed7d79cda854a54e111839eb69ce"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

