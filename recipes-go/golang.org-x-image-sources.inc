SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20210607152325-775e3b0c77b9.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20210607152325-775e3b0c77b9;downloadfilename=golang-org-x-image-0.0.0-20210607152325-775e3b0c77b9.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "16bbfcea4d04a252fe7fa39b33f42d19a9f2a2278e571a6368ae464d754c8a81"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
