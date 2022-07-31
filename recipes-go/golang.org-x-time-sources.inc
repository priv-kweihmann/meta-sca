SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20220722155302-e5dcc9cfc0b9.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20220722155302-e5dcc9cfc0b9;downloadfilename=golang-org-x-time-0.0.0-20220722155302-e5dcc9cfc0b9.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "c4baaf6ac848f07635435cecf893bda93e88fda1ea535bc741a30eda18f6e239"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

