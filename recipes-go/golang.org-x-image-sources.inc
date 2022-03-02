SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20220302094943-723b81ca9867.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20220302094943-723b81ca9867;downloadfilename=golang-org-x-image-0.0.0-20220302094943-723b81ca9867.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "56176a4d4d47910d61df9a77aa66a8469ae79fa18b7f5821c43bef1ef212116d"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
