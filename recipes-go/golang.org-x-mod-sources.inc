SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.29.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.29.0;downloadfilename=golang-org-x-mod-0.29.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "7c736672c72aa571b65c1106bbb2a64e587dd4265a18f0059c990f95c5117962"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

