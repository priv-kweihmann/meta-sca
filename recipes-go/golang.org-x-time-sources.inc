SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.3.0.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.3.0;downloadfilename=golang-org-x-time-0.3.0.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "fa9a1fcd03a4acb817faa5d44e95f0a73182a96cb81012c9b94f832d70f7296b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

