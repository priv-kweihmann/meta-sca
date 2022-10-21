SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.6.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.6.0;downloadfilename=golang-org-x-mod-0.6.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "3f45c4fd992e55f087484632cb6bf19f5bba68e51bd18a2f3e10c88771eec268"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
