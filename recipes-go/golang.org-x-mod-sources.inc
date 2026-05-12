SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.36.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.36.0;downloadfilename=golang-org-x-mod-0.36.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "5410180c3dd4cd6e3ad08e7f47586fd93de65ca9c0a8891a8f964d321f74b60b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

