SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220330033206-e17cdc41300f.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220330033206-e17cdc41300f;downloadfilename=golang-org-x-sys-0.0.0-20220330033206-e17cdc41300f.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "816ae04aa553e5cd4544fe064a81796406fbaa3f161cff609d306528c0821efa"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

