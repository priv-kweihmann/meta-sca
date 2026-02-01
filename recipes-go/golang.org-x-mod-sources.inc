SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.32.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.32.0;downloadfilename=golang-org-x-mod-0.32.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "c0fcee2c1ef1a0a817e81056342bc6cb8b12d11be1addfe3ba87434a2e3044cf"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

