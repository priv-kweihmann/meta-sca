SRC_URI += "https://proxy.golang.org/github.com/mcandre/stank/@v/v0.0.26.zip;srcoutput=github.com/mcandre/stank;srcinput=github.com/mcandre/stank@v0.0.26;downloadfilename=github-com-mcandre-stank-0.0.26.zip;name=github-com-mcandre-stank"
SRC_URI[github-com-mcandre-stank.sha256sum] = "fbe2e0b9c19922e81315b989127d2461ae2d969d2aad7324f1fdea84743ffe17"

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
