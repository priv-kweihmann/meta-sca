SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.31.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.31.0;downloadfilename=golang-org-x-mod-0.31.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "9b43daca51525bd50289c742999fe66336a653c90a23d2c55561b6fffd656e46"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

