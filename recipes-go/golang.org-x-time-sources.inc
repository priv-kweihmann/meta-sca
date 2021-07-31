SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20210723032227-1f47c861a9ac.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20210723032227-1f47c861a9ac;downloadfilename=golang-org-x-time-0.0.0-20210723032227-1f47c861a9ac.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "e5d8ade42804ec7d96a632c031dde7db087e8bc4cd5dfd6f38df03ce4f16d9b6"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

