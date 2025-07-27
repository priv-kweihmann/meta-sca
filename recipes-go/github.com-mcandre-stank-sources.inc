SRC_URI += "https://proxy.golang.org/github.com/mcandre/stank/@v/v0.0.35.zip;srcoutput=github.com/mcandre/stank;srcinput=github.com/mcandre/stank@v0.0.35;downloadfilename=github-com-mcandre-stank-0.0.35.zip;name=github-com-mcandre-stank"
SRC_URI[github-com-mcandre-stank.sha256sum] = "7a7958a7de8f7cd8e11586eefe1d0a67e803835d3a6e7114198f9fcb91dce66e"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mcandre/stank/LICENSE.md;md5=6a55da1ae5d911566ba1a841e39c5a42 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-stank-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcandre-mage-extras-sources.inc', '', 'github.com-mcandre-mage-extras-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-sh-v3-sources.inc', '', 'mvdan.cc-sh-v3-sources.inc', d)}
