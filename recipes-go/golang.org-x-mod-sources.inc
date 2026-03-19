SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.34.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.34.0;downloadfilename=golang-org-x-mod-0.34.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "8e6b8d8a771dac070d44c8c701b1fba4c3565031f4f7170e6fed9d3022b4aa32"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

