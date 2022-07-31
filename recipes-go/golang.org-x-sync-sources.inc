SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.0.0-20220722155255-886fb9371eb4.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.0.0-20220722155255-886fb9371eb4;downloadfilename=golang-org-x-sync-0.0.0-20220722155255-886fb9371eb4.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "39d2431ae1db11be34b4012b719e7bcec1572006a122d44509da038a5b498ff1"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

