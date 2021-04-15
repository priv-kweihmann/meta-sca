SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20210220032944-ac19c3e999fb.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20210220032944-ac19c3e999fb;downloadfilename=golang-org-x-image-0.0.0-20210220032944-ac19c3e999fb.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "1473b0581480004ea03dc792eb3017de3eeb1191943000b42b2e9c32f4b78246"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
