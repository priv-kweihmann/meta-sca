SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220517195934-5e4e11fc645e.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220517195934-5e4e11fc645e;downloadfilename=golang-org-x-sys-0.0.0-20220517195934-5e4e11fc645e.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "b447fb73c3c7b4501168e0219705d7a837c606874b807d9740176ca9888190e0"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

