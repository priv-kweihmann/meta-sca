SRC_URI += "https://proxy.golang.org/github.com/mcandre/mage-extras/@v/v0.0.22.zip;srcoutput=github.com/mcandre/mage-extras;srcinput=github.com/mcandre/mage-extras@v0.0.22;downloadfilename=github-com-mcandre-mage-extras-0.0.22.zip;name=github-com-mcandre-mage-extras"
SRC_URI[github-com-mcandre-mage-extras.sha256sum] = "5e26db4de766b3cba227c4e1d0c6469f874f5eeafb473d19b44794fc072f4b87"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mcandre/mage-extras/LICENSE.md;md5=ee3d9cef7abda52cae7b1355acf6a9f4 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-mage-extras-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
