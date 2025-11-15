SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.30.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.30.0;downloadfilename=golang-org-x-mod-0.30.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "dffdae50c0a7903e522053e8e9880069ed1854446326f954cf903f713678c3a2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

