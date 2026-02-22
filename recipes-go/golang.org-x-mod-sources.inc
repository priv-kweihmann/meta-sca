SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.33.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.33.0;downloadfilename=golang-org-x-mod-0.33.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "a5a4c8a9f6700712216df6bc4bc45544494736b5383aebb784fdb2dd0f41f36b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/mod/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

