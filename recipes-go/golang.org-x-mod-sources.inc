SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.21.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.21.0;downloadfilename=golang-org-x-mod-0.21.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "e736e1acca78c9550fa78f54de78d9cf15d5db1ca7d92537900c8591e6ab79c0"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

