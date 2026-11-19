SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.43.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.43.0;downloadfilename=golang-org-x-mod-0.43.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "11b3093d75f4fccd371a6f87f8739eb61671b293ad1e8fa1f33ba5d9206fb717"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

