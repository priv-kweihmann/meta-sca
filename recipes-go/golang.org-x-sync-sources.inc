SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.0.0-20220907140024-f12130a52804.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.0.0-20220907140024-f12130a52804;downloadfilename=golang-org-x-sync-0.0.0-20220907140024-f12130a52804.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "845dc157f8d868542a31d8caad9ee91462adbd286573f79ad231fcc3380ce478"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

