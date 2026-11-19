SRC_URI += "https://proxy.golang.org/github.com/mcandre/stank/@v/v0.0.45.zip;srcoutput=github.com/mcandre/stank;srcinput=github.com/mcandre/stank@v0.0.45;downloadfilename=github-com-mcandre-stank-0.0.45.zip;name=github-com-mcandre-stank"
SRC_URI[github-com-mcandre-stank.sha256sum] = "f3ee732d4d0202935a5d1d4507ad4bf6f1bafa1fd51f128649303db64b213d2b"

GOSRC_LICENSE += "\
    0BSD \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mcandre/stank/LICENSE.md;md5=243a8c3620f02a662c4fed78e2be8ed9 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-stank-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcandre-mx-sources.inc', '', 'github.com-mcandre-mx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-sh-v3-sources.inc', '', 'mvdan.cc-sh-v3-sources.inc', d)}
