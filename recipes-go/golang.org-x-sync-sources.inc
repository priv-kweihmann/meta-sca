SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.0.0-20220601150217-0de741cfad7f.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.0.0-20220601150217-0de741cfad7f;downloadfilename=golang-org-x-sync-0.0.0-20220601150217-0de741cfad7f.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "2ea9ee4a150eceea9430ebb125830fd1eb2bfd8361127032838ef5907ad93f33"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

