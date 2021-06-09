SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20210608053304-ed9ce3a009e4.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20210608053304-ed9ce3a009e4;downloadfilename=golang-org-x-time-0.0.0-20210608053304-ed9ce3a009e4.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "40e67b77a7ec57dc72b4000849f963d06161847470b2a3bed94e1b95c30ea45e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

