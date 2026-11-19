SRC_URI += "https://proxy.golang.org/github.com/mcandre/slick/@v/v0.0.22.zip;srcoutput=github.com/mcandre/slick;srcinput=github.com/mcandre/slick@v0.0.22;downloadfilename=github-com-mcandre-slick-0.0.22.zip;name=github-com-mcandre-slick"
SRC_URI[github-com-mcandre-slick.sha256sum] = "cd020184d1b42c72857f02b59d9a3e4a0e57e13be90de6c8aaad9fa3ab224377"

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
