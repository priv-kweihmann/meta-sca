SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.22.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.22.0;downloadfilename=golang-org-x-mod-0.22.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "0d0a96054b32dfa40cec2a2868bf87cdda31e3bb2dac0a5e2218efe3ef3ef3cc"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

