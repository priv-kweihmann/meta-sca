SRC_URI += "https://proxy.golang.org/golang.org/x/image/@v/v0.0.0-20210504121937-7319ad40d33e.zip;srcoutput=golang.org/x/image;srcinput=golang.org/x/image@v0.0.0-20210504121937-7319ad40d33e;downloadfilename=golang-org-x-image-0.0.0-20210504121937-7319ad40d33e.zip;name=golang-org-x-image"
SRC_URI[golang-org-x-image.sha256sum] = "b860a1ef5b0c2e22f982894f54a640e0f9ac73639e104c6d3f4b4230eedd3f13"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/image/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-image-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
