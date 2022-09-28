SRC_URI += "https://proxy.golang.org/golang.org/x/mobile/@v/v0.0.0-20220928052126-fa6bcb076835.zip;srcoutput=golang.org/x/mobile;srcinput=golang.org/x/mobile@v0.0.0-20220928052126-fa6bcb076835;downloadfilename=golang-org-x-mobile-0.0.0-20220928052126-fa6bcb076835.zip;name=golang-org-x-mobile"
SRC_URI[golang-org-x-mobile.sha256sum] = "1fa33cf9c86a667a8ed066247fe356e29ec6baabcd2818a0256e8f9409a979f0"

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
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
