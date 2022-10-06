SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.0.0-20220929204114-8fcdb60fdcc0.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.0.0-20220929204114-8fcdb60fdcc0;downloadfilename=golang-org-x-sync-0.0.0-20220929204114-8fcdb60fdcc0.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "18fd46c2fbf0fb98a8bda7eef07cdbcc9460f3547012bab84094957ef550803f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

