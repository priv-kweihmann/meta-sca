SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.25.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.25.0;downloadfilename=golang-org-x-mod-0.25.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "f3021e5e6a777c146e469027accf1eb363eea3045ff812099152b20f2618f61c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

