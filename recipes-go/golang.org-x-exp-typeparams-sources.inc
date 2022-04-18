SRC_URI += "https://proxy.golang.org/golang.org/x/exp/typeparams/@v/v0.0.0-20220414153411-bcd21879b8fd.zip;srcoutput=golang.org/x/exp/typeparams;srcinput=golang.org/x/exp/typeparams@v0.0.0-20220414153411-bcd21879b8fd;downloadfilename=golang-org-x-exp-typeparams-0.0.0-20220414153411-bcd21879b8fd.zip;name=golang-org-x-exp-typeparams"
SRC_URI[golang-org-x-exp-typeparams.sha256sum] = "b2a8256985498d4ded1bff8bdfddbf4b4431e65f8839f37e21ab8529b88f61e2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/typeparams/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-typeparams-sources.inc"

