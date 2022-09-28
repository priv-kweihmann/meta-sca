SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.0.0-20220923202941-7f9b1623fab7.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.0.0-20220923202941-7f9b1623fab7;downloadfilename=golang-org-x-sync-0.0.0-20220923202941-7f9b1623fab7.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "81834fca9f7e10a23bc4b32403886b9c7dc8059239231acaffc56a51be20f547"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

