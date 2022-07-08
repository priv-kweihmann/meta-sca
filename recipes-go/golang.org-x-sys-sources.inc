SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220704084225-05e143d24a9e.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220704084225-05e143d24a9e;downloadfilename=golang-org-x-sys-0.0.0-20220704084225-05e143d24a9e.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "cffc36b69552373563ce8c02b234e58d39e652b5f9fbe8a515dce13cdcb707d8"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

