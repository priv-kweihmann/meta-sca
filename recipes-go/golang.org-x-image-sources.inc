SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20220601225756-64ec528b34cd.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20220601225756-64ec528b34cd;downloadfilename=golang-org-x-image-0.0.0-20220601225756-64ec528b34cd.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "752fdcfe911cc82341ec7a8dfaaaf0e7055e65d3c5bf3a69022320092ec64bc3"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
