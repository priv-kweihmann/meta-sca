SRC_URI += "https://proxy.golang.org/golang.org/x/text/@v/v0.3.6.zip;srcoutput=golang.org/x/text;srcinput=golang.org/x/text@v0.3.6;downloadfilename=golang-org-x-text-0.3.6.zip;name=golang-org-x-text"
SRC_URI[golang-org-x-text.sha256sum] = "2afade648a4cb240afb7b3bf8e3719b615169c90d6281bd6d4ba34629c744579"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/text/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-text-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
