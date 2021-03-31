SRC_URI_append = " https://proxy.golang.org/golang.org/x/mod/@v/v0.4.2.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.4.2;downloadfilename=golang-org-x-mod-0.4.2.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "39bc9b1570666300ba5c86244621ffbcc63b007ce69e6b7a46ffba7691929621"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
