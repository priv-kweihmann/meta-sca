SRC_URI += "https://proxy.golang.org/golang.org/x/mod/@v/v0.7.0.zip;srcoutput=golang.org/x/mod;srcinput=golang.org/x/mod@v0.7.0;downloadfilename=golang-org-x-mod-0.7.0.zip;name=golang-org-x-mod"
SRC_URI[golang-org-x-mod.sha256sum] = "24abd1db13329873d72034dc27efad09cbc37d39cf28b8ff7bb3c2adc8eedef7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mod-sources.inc"

