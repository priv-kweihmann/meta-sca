SRC_URI += "https://proxy.golang.org/github.com/mcandre/mage-extras/@v/v0.0.23.zip;srcoutput=github.com/mcandre/mage-extras;srcinput=github.com/mcandre/mage-extras@v0.0.23;downloadfilename=github-com-mcandre-mage-extras-0.0.23.zip;name=github-com-mcandre-mage-extras"
SRC_URI[github-com-mcandre-mage-extras.sha256sum] = "93609e94e15c1462cae762b0a0614b6485cce6a70730f989af8f982b1ce2d12e"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mcandre/mage-extras/LICENSE.md;md5=ee3d9cef7abda52cae7b1355acf6a9f4 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-mage-extras-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
