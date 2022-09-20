SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20220920022843-2ce7c2934d45.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20220920022843-2ce7c2934d45;downloadfilename=golang-org-x-time-0.0.0-20220920022843-2ce7c2934d45.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "ffb67f562a815107af8a998b15b9e7020c4ba49dfafe9fbba31835a94964f634"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

