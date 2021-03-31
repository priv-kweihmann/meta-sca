SRC_URI_append = " https://proxy.golang.org/golang.org/x/term/@v/v0.0.0-20210317153231-de623e64d2a6.zip;srcoutput=golang.org/x/term;srcinput=golang.org/x/term@v0.0.0-20210317153231-de623e64d2a6;downloadfilename=golang-org-x-term-0.0.0-20210317153231-de623e64d2a6.zip;name=golang-org-x-term"
SRC_URI[golang-org-x-term.sha256sum] = "c42a3a70d7342d71386c88e9ab0bfc2edaa1d14ded8d61273fcf6bd5629b0970"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
