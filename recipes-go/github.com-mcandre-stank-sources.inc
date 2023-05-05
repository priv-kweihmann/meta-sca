SRC_URI += "https://proxy.golang.org/github.com/mcandre/stank/@v/v0.0.24.zip;srcoutput=github.com/mcandre/stank;srcinput=github.com/mcandre/stank@v0.0.24;downloadfilename=github-com-mcandre-stank-0.0.24.zip;name=github-com-mcandre-stank"
SRC_URI[github-com-mcandre-stank.sha256sum] = "3555a7c0d4cb74e05cc72338c7f32230cbd5e464f62bc79dd241f46e3cb085af"

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
