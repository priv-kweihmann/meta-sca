SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20210628002857-a66eb6448b8d.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20210628002857-a66eb6448b8d;downloadfilename=golang-org-x-image-0.0.0-20210628002857-a66eb6448b8d.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "70cf423fad9be160a88fbf01bc1897efd888f915a6d7ba0dd41ca7085f75e06e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
