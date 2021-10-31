SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20211028202545-6944b10bf410.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20211028202545-6944b10bf410;downloadfilename=golang-org-x-image-0.0.0-20211028202545-6944b10bf410.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "b7cf08ae55a8af42abb152b5d6baa868462a29d3a28f87d9600f75dd08d30b40"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
