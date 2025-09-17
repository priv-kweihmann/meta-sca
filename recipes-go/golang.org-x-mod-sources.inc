SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.28.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.28.0;downloadfilename=golang-org-x-mod-0.28.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "1033fb59927549a16c7000369f6d534b652fcd201746a7d6d8cfd521e1ad85e2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

