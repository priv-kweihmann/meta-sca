SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20220617043117-41969df76e82.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20220617043117-41969df76e82;downloadfilename=golang-org-x-image-0.0.0-20220617043117-41969df76e82.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "c3a87d906f99dee6527f1a22e415f00ac441d9220a718412e6aec51649ce2714"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
