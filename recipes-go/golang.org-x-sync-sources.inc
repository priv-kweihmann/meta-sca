SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.10.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.10.0;downloadfilename=golang-org-x-sync-0.10.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "94ea75ea625ecb8d81ab473a2d7e03433e63083768cd27d48a03f8c1c9da3d8d"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sync/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

