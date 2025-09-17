SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.17.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.17.0;downloadfilename=golang-org-x-sync-0.17.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "c5dcfd32e223edc7a003a51a166a81759a4beccb9a91eb85385b4d67a1c820c6"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sync/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

