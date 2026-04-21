SRC_URI += "https://proxy.golang.org/github.com/mcandre/slick/@v/v0.0.21.zip;srcoutput=github.com/mcandre/slick;srcinput=github.com/mcandre/slick@v0.0.21;downloadfilename=github-com-mcandre-slick-0.0.21.zip;name=github-com-mcandre-slick"
SRC_URI[github-com-mcandre-slick.sha256sum] = "a74ade8f368d036fbb26bb5e6b57caed292d19ddb60373fdc4240589326b18cf"

GOSRC_LICENSE += "\
    0BSD \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mcandre/slick/LICENSE.md;md5=243a8c3620f02a662c4fed78e2be8ed9 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-slick-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcandre-mx-sources.inc', '', 'github.com-mcandre-mx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-sh-v3-sources.inc', '', 'mvdan.cc-sh-v3-sources.inc', d)}
