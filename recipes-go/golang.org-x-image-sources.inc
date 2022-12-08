SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.2.0.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.2.0;downloadfilename=golang-org-x-image-0.2.0.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "63dbeb3b78173e63b17adc97084ccd005fe5ce367de8dec4d3b3c480884aa22c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
