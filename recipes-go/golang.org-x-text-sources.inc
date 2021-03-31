SRC_URI_append = " https://proxy.golang.org/golang.org/x/text/@v/v0.3.5.zip;srcoutput=golang.org/x/text;srcinput=golang.org/x/text@v0.3.5;downloadfilename=golang-org-x-text-0.3.5.zip;name=golang-org-x-text"
SRC_URI[golang-org-x-text.sha256sum] = "ff1a0f5b0a1fd41369eed872f9836226139f4df65c344b12cc596f4b5d960cd3"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/text/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
