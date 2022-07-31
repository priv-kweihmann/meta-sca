SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20220722155232-062f8c9fd539.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20220722155232-062f8c9fd539;downloadfilename=golang-org-x-image-0.0.0-20220722155232-062f8c9fd539.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "dcf67e680924829b096e71f4c241bd3d6d8a2e1feb3b72c3db68304deddc0bea"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
