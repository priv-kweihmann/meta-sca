SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.18.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.18.0;downloadfilename=golang-org-x-sync-0.18.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "939a1a573cd83df56836b637052a45f6a60f78b86a5a375fc0c6c298a868a14d"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sync/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

