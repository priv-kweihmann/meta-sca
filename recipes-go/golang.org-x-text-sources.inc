SRC_URI += "https://proxy.golang.org/golang.org/x/text/@v/v0.3.7.zip;srcoutput=golang.org/x/text;srcinput=golang.org/x/text@v0.3.7;downloadfilename=golang-org-x-text-0.3.7.zip;name=golang-org-x-text"
SRC_URI[golang-org-x-text.sha256sum] = "e1a9115e61a38da8bdc893d0ba83b65f89cc1114f152a98eb572c5ea6551e8d4"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/text/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-text-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
