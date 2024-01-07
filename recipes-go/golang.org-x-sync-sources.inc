SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.6.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.6.0;downloadfilename=golang-org-x-sync-0.6.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "7c75175297a3b368b806bd24c7401629df11dcc655e3c14470058282f101ca6a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

