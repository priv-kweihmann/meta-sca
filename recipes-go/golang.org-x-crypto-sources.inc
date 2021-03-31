SRC_URI_append = " https://proxy.golang.org/golang.org/x/crypto/@v/v0.0.0-20210322153248-0c34fe9e7dc2.zip;srcoutput=golang.org/x/crypto;srcinput=golang.org/x/crypto@v0.0.0-20210322153248-0c34fe9e7dc2;downloadfilename=golang-org-x-crypto-0.0.0-20210322153248-0c34fe9e7dc2.zip;name=golang-org-x-crypto"
SRC_URI[golang-org-x-crypto.sha256sum] = "2d8c67019031583297a020f2fea24f726808f6bbf9374fcc4ec609c47b6ca2e7"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/crypto/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
