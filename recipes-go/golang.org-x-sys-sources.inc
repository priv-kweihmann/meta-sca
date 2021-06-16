SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210616094352-59db8d763f22.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210616094352-59db8d763f22;downloadfilename=golang-org-x-sys-0.0.0-20210616094352-59db8d763f22.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "c4f9c81ce8f1b8ccfd9ce34305d8c7eb7d94c87c7e0d88394ebd6298730ebe38"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

