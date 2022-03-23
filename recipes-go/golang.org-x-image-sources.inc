SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20220321031419-a8550c1d254a.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20220321031419-a8550c1d254a;downloadfilename=golang-org-x-image-0.0.0-20220321031419-a8550c1d254a.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "98554e068ec73989dc9907918f0a17bb03fad190eb8bc07b14ddeb22fb2d7018"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
