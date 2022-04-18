SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20220413100746-70e8d0d3baa9.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20220413100746-70e8d0d3baa9;downloadfilename=golang-org-x-image-0.0.0-20220413100746-70e8d0d3baa9.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "2781a1a98d18af6c2cee653033c2a126d32b60bb8e01c6fda6fc61df94f0e595"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
