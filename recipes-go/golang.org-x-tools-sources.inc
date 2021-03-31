SRC_URI_append = " https://proxy.golang.org/golang.org/x/tools/@v/v0.1.0.zip;srcoutput=golang.org/x/tools;srcinput=golang.org/x/tools@v0.1.0;downloadfilename=golang-org-x-tools-0.1.0.zip;name=golang-org-x-tools"
SRC_URI[golang-org-x-tools.sha256sum] = "bb7d50a844ccfbe67a8d51ce04404bddc8cdc46eaf3fe82d84806d61fffc22dd"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/tools/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
    file://src/golang.org/x/tools/cmd/getgo/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab \
"
