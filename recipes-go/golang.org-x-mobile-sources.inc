SRC_URI += "https://proxy.golang.org/golang.org/x/mobile/@v/v0.0.0-20220518035003-eae5320c54e0.zip;srcoutput=golang.org/x/mobile;srcinput=golang.org/x/mobile@v0.0.0-20220518035003-eae5320c54e0;downloadfilename=golang-org-x-mobile-0.0.0-20220518035003-eae5320c54e0.zip;name=golang-org-x-mobile"
SRC_URI[golang-org-x-mobile.sha256sum] = "9a02153010ebb2cce86d978d3d04b387c20d061e1e39cc18d780f0bb0f8953e4"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/mobile/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-mobile-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-sources.inc', '', 'golang.org-x-exp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
