SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.14.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.14.0;downloadfilename=golang-org-x-sync-0.14.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "8b19a2aa2162ec8fa1cba4762eb06b089ef8d2dbddf4e64ef51334e722b83a7f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sync/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

