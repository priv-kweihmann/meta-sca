SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.1.0.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.1.0;downloadfilename=golang-org-x-time-0.1.0.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "2cc0a1d1bfa40badddc16c2715ff58502fe53422894bbe09d1b0de90a8845888"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

