SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.15.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.15.0;downloadfilename=golang-org-x-sync-0.15.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "74e221ae87caa0f9c7ec8c48c1ca39e9579ed89f094c7944bdda1cacae7d2a00"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sync/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

