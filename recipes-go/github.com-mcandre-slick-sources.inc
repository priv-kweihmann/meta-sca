SRC_URI += "https://proxy.golang.org/github.com/mcandre/slick/@v/v0.0.19.zip;srcoutput=github.com/mcandre/slick;srcinput=github.com/mcandre/slick@v0.0.19;downloadfilename=github-com-mcandre-slick-0.0.19.zip;name=github-com-mcandre-slick"
SRC_URI[github-com-mcandre-slick.sha256sum] = "833f3da7f88ea6c45cb240449b0137d15caf0cb353e17384d0bd1d7420c17d7c"

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
