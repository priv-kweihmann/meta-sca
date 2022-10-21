SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.1.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.1.0;downloadfilename=golang-org-x-sync-0.1.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "f510bec6009e19882d19953e7273137d34df86c65949345d72f123a255c2ecd2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

