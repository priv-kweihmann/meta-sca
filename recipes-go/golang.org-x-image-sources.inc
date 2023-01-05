SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.3.0.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.3.0;downloadfilename=golang-org-x-image-0.3.0.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "2507b5e88d30ffd95ca82f14f2ffe2429710a20b90a45f895b8f4b81147dc3f6"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
