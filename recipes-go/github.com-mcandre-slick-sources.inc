SRC_URI += "https://proxy.golang.org/github.com/mcandre/slick/@v/v0.0.15.zip;srcoutput=github.com/mcandre/slick;srcinput=github.com/mcandre/slick@v0.0.15;downloadfilename=github-com-mcandre-slick-0.0.15.zip;name=github-com-mcandre-slick"
SRC_URI[github-com-mcandre-slick.sha256sum] = "1061f831a2055e91fc39c87bebaa04595118b1c41df290a89c0a19371fa1384f"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mcandre/slick/LICENSE.md;md5=6a55da1ae5d911566ba1a841e39c5a42 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-slick-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcandre-mage-extras-sources.inc', '', 'github.com-mcandre-mage-extras-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-sh-v3-sources.inc', '', 'mvdan.cc-sh-v3-sources.inc', d)}
