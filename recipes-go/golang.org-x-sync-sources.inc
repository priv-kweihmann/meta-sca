SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.4.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.4.0;downloadfilename=golang-org-x-sync-0.4.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "77c5d9c48ba1c440060c87d9a1b67f2ef5216994228e14ad3fcfe2dd9b3f2134"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

