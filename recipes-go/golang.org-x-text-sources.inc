SRC_URI += "https://proxy.golang.org/golang.org/x/text/@v/v0.10.0.zip;srcoutput=golang.org/x/text;srcinput=golang.org/x/text@v0.10.0;downloadfilename=golang-org-x-text-0.10.0.zip;name=golang-org-x-text"
SRC_URI[golang-org-x-text.sha256sum] = "53e4f1af4371e78ec717fa1a2919eb9fbfb1b24c743554cfd005ee436388cee2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/text/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-text-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
