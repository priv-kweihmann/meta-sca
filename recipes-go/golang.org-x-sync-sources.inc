SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.7.0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.7.0;downloadfilename=golang-org-x-sync-0.7.0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "20b01085240e661bffc7f59383f21b90f112d669784220c6e59c801243216d22"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

