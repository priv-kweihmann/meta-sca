SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20220902085622-e7cb96979f69.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20220902085622-e7cb96979f69;downloadfilename=golang-org-x-image-0.0.0-20220902085622-e7cb96979f69.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "0169cad235a87dc82f3b24303bcc7f1c25b9d4993d9a503ce7310815dba86f0f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
