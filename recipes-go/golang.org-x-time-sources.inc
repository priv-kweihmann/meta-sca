SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20220609170525-579cf78fd858.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20220609170525-579cf78fd858;downloadfilename=golang-org-x-time-0.0.0-20220609170525-579cf78fd858.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "0a7c72d3aca31d407117e2fe4f91d8397351d57a4d3bf55589f18061aae35e62"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

