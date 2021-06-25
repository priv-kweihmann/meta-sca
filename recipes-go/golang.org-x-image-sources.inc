SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20210622092929-e6eecd499c2c.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20210622092929-e6eecd499c2c;downloadfilename=golang-org-x-image-0.0.0-20210622092929-e6eecd499c2c.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "6579dc5dc7ddf634321d754a4afe952e370853e2462ce60acbe2fb1c9feae90f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
