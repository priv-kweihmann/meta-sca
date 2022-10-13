SRC_URI += "https://proxy.golang.org/golang.org/x/text/@v/v0.3.8.zip;srcoutput=golang.org/x/text;srcinput=golang.org/x/text@v0.3.8;downloadfilename=golang-org-x-text-0.3.8.zip;name=golang-org-x-text"
SRC_URI[golang-org-x-text.sha256sum] = "66af186502189c9365fcf0ce1746e2ae96c0f7ec38c78adda3a4e9f5ffce02cd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/text/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-text-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
