SRC_URI += "https://proxy.golang.org/github.com/mcandre/mage-extras/@v/v0.0.12.zip;srcoutput=github.com/mcandre/mage-extras;srcinput=github.com/mcandre/mage-extras@v0.0.12;downloadfilename=github-com-mcandre-mage-extras-0.0.12.zip;name=github-com-mcandre-mage-extras"
SRC_URI[github-com-mcandre-mage-extras.sha256sum] = "b0299c0311aaffc0760d0d297f139c3315d173ecf009808380d49d6900fdf2a3"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mcandre/mage-extras/LICENSE.md;md5=ee3d9cef7abda52cae7b1355acf6a9f4 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-mage-extras-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcandre-factorio-sources.inc', '', 'github.com-mcandre-factorio-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcandre-zipc-sources.inc', '', 'github.com-mcandre-zipc-sources.inc', d)}
