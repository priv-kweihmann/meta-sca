SRC_URI_append = " https://proxy.golang.org/golang.org/x/oauth2/@v/v0.0.0-20210323180902-22b0adad7558.zip;srcoutput=golang.org/x/oauth2;srcinput=golang.org/x/oauth2@v0.0.0-20210323180902-22b0adad7558;downloadfilename=golang-org-x-oauth2-0.0.0-20210323180902-22b0adad7558.zip;name=golang-org-x-oauth2"
SRC_URI[golang-org-x-oauth2.sha256sum] = "3798afcd8d1c0addeb58971449fe10d3bdec044c96749545f1f8df852c25633f"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/golang.org/x/oauth2/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
