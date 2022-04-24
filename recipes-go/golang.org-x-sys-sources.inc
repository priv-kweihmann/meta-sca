SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220422013727-9388b58f7150.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220422013727-9388b58f7150;downloadfilename=golang-org-x-sys-0.0.0-20220422013727-9388b58f7150.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "31ab4197e7c6ce4e2808ee18e788e23be476824d7c900be4743a425b5a197484"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

