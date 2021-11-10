SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211109184856-51b60fd695b3.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211109184856-51b60fd695b3;downloadfilename=golang-org-x-sys-0.0.0-20211109184856-51b60fd695b3.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "830e215ff2f5fff4be12e46142729389c7b86d2cb38151e3e3fc3fd88e36e8f7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

