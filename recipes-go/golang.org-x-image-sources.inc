SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.5.0.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.5.0;downloadfilename=golang-org-x-image-0.5.0.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "300661d9c1e114914d6f70b14b50768ce3e93dbbede56cd801f611ff4edda220"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
