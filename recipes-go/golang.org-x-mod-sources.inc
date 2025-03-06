SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.24.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.24.0;downloadfilename=golang-org-x-mod-0.24.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "1a8ef77bb4d41c1a7d3fa5d0caf2fe599f14eac10f473629e31546f12759b89f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

