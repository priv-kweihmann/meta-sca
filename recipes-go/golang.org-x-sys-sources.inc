SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220712014510-0a85c31ab51e.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220712014510-0a85c31ab51e;downloadfilename=golang-org-x-sys-0.0.0-20220712014510-0a85c31ab51e.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "55eee4574c09b9156ce7d517b14533007eb63fdba0046a67b06e5a6ec7a1e7ad"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

