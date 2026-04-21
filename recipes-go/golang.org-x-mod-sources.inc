SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.35.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.35.0;downloadfilename=golang-org-x-mod-0.35.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "6a64c84837167aa92a5dd55aa318351b8c45623b2fb80804cce704e72a9621c8"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

