SRC_URI += "https://proxy.golang.org/golang.org/x/sync/@v/v0.0.0-20220819030929-7fc1605a5dde.zip;srcoutput=golang.org/x/sync;srcinput=golang.org/x/sync@v0.0.0-20220819030929-7fc1605a5dde;downloadfilename=golang-org-x-sync-0.0.0-20220819030929-7fc1605a5dde.zip;name=golang-org-x-sync"
SRC_URI[golang-org-x-sync.sha256sum] = "b6468d7bfef94d374bfb332d3ba79f263464ca61902d12017de05962b442e699"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sync-sources.inc"

