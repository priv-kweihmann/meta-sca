SRC_URI += "https://proxy.golang.org/github.com/fyne-io/mobile/@v/v0.1.2.zip;srcoutput=github.com/fyne-io/mobile;srcinput=github.com/fyne-io/mobile@v0.1.2;downloadfilename=github-com-fyne-io-mobile-0.1.2.zip;name=github-com-fyne-io-mobile"
SRC_URI[github-com-fyne-io-mobile.sha256sum] = "fe5e7c764434e648c9c34422a566b6408b960d1e6b2981d50f0ef6f2f8f8fdfd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fyne-io/mobile/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "github.com-fyne-io-mobile-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
