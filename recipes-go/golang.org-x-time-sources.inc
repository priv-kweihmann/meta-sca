SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20220922220347-f3bd1da661af.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20220922220347-f3bd1da661af;downloadfilename=golang-org-x-time-0.0.0-20220922220347-f3bd1da661af.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "d3cc1178fb4e6fa0886675fa8bc0a59728aead5ae561f98e6e91c285e8597927"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

