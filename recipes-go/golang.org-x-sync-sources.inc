SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.0.0-20220513210516-0976fa681c29.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.0.0-20220513210516-0976fa681c29;downloadfilename=golang-org-x-sync-0.0.0-20220513210516-0976fa681c29.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "71d4baca5c8f5ba665560e1bd96e3f73187d73d7dbc8f4a26faa73e5865b0749"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

