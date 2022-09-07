SRC_URI += "https://proxy.golang.org/golang.org/x/exp/typeparams/@v/v0.0.0-20220907003533-145caa8ea1d0.zip;srcoutput=golang.org/x/exp/typeparams;srcinput=golang.org/x/exp/typeparams@v0.0.0-20220907003533-145caa8ea1d0;downloadfilename=golang-org-x-exp-typeparams-0.0.0-20220907003533-145caa8ea1d0.zip;name=golang-org-x-exp-typeparams"
SRC_URI[golang-org-x-exp-typeparams.sha256sum] = "e682d380353f8965f387dc0d6267ce8716d7a413f60119dd71e275f41d5924d4"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/typeparams/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-typeparams-sources.inc"

