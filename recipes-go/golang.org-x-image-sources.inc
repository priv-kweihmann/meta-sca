SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.4.0.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.4.0;downloadfilename=golang-org-x-image-0.4.0.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "67893e44ffb2f857aa3d8775d56c2b92960d8dde7f0dae1879ca159900a796a2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
