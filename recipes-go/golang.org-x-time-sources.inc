SRC_URI += "https://proxy.golang.org/golang.org/x/time/@v/v0.0.0-20210611083556-38a9dc6acbc6.zip;srcoutput=golang.org/x/time;srcinput=golang.org/x/time@v0.0.0-20210611083556-38a9dc6acbc6;downloadfilename=golang-org-x-time-0.0.0-20210611083556-38a9dc6acbc6.zip;name=golang-org-x-time"
SRC_URI[golang-org-x-time.sha256sum] = "16aaea9ef9e831efa5f401c8f341e20708756ceef1fa621a30fff742eeb6500f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/time/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-time-sources.inc"

