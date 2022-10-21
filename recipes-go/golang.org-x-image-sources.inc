SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20221017200508-ffcb3fe7d1bf.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20221017200508-ffcb3fe7d1bf;downloadfilename=golang-org-x-image-0.0.0-20221017200508-ffcb3fe7d1bf.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "fb007f636aba405b11e11f98f48167d9f8a04d0588654d054cc57f7123e154f9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
