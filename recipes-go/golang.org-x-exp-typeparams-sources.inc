SRC_URI += "https://proxy.golang.org/golang.org/x/exp/typeparams/@v/v0.0.0-20230213192124-5e25df0256eb.zip;srcoutput=golang.org/x/exp/typeparams;srcinput=golang.org/x/exp/typeparams@v0.0.0-20230213192124-5e25df0256eb;downloadfilename=golang-org-x-exp-typeparams-0.0.0-20230213192124-5e25df0256eb.zip;name=golang-org-x-exp-typeparams"
SRC_URI[golang-org-x-exp-typeparams.sha256sum] = "d1541cd9a133b74e0419761da233d8183e443365c0f804255e717f962a6758c8"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/typeparams/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-typeparams-sources.inc"

