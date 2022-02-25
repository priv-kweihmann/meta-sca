SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20220224211638-0e9765cccd65.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20220224211638-0e9765cccd65;downloadfilename=golang-org-x-time-0.0.0-20220224211638-0e9765cccd65.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "9cc2471c4ce489268becb840c3f0aa947e5d9fed824fe18b620bf4c23a8c4acf"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

