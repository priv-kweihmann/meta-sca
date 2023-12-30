SRC_URI += "https://proxy.golang.org/github.com/mcandre/stank/@v/v0.0.25.zip;srcoutput=github.com/mcandre/stank;srcinput=github.com/mcandre/stank@v0.0.25;downloadfilename=github-com-mcandre-stank-0.0.25.zip;name=github-com-mcandre-stank"
SRC_URI[github-com-mcandre-stank.sha256sum] = "cb5c25c5dbbe238e4972a7be9a84ae256be651724897712b2aecdf38569d8d31"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mcandre/stank/LICENSE.md;md5=6a55da1ae5d911566ba1a841e39c5a42 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-stank-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcandre-mage-extras-sources.inc', '', 'github.com-mcandre-mage-extras-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-sh-sources.inc', '', 'mvdan.cc-sh-sources.inc', d)}
