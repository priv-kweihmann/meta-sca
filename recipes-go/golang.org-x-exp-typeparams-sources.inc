SRC_URI += "https://proxy.golang.org/golang.org/x/exp/typeparams/@v/v0.0.0-20230129154200-a960b3787bd2.zip;srcoutput=golang.org/x/exp/typeparams;srcinput=golang.org/x/exp/typeparams@v0.0.0-20230129154200-a960b3787bd2;downloadfilename=golang-org-x-exp-typeparams-0.0.0-20230129154200-a960b3787bd2.zip;name=golang-org-x-exp-typeparams"
SRC_URI[golang-org-x-exp-typeparams.sha256sum] = "5e22fd233a30f78f7b018949548e005211a2c0f5e9f6ba5cab28af7480b77c80"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/typeparams/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-typeparams-sources.inc"

