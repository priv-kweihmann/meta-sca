SRC_URI += "https://proxy.golang.org/golang.org/x/exp/typeparams/@v/v0.0.0-20220407100705-7b9b53b0aca4.zip;srcoutput=golang.org/x/exp/typeparams;srcinput=golang.org/x/exp/typeparams@v0.0.0-20220407100705-7b9b53b0aca4;downloadfilename=golang-org-x-exp-typeparams-0.0.0-20220407100705-7b9b53b0aca4.zip;name=golang-org-x-exp-typeparams"
SRC_URI[golang-org-x-exp-typeparams.sha256sum] = "16360b14401a69c83b0e60eaf81283f5a78dce707a6ece3a7b1e3b51ecd48a6e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/typeparams/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-typeparams-sources.inc"

