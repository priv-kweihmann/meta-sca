SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.3.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.3.0;downloadfilename=golang-org-x-sync-0.3.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "1870e7a196f7119d4c6edba7de9cdfc49ee13c8cb7921f3a947568171c6152e0"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

