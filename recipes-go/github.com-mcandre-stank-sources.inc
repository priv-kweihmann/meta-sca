SRC_URI += "https://proxy.golang.org/github.com/mcandre/stank/@v/v0.0.42.zip;srcoutput=github.com/mcandre/stank;srcinput=github.com/mcandre/stank@v0.0.42;downloadfilename=github-com-mcandre-stank-0.0.42.zip;name=github-com-mcandre-stank"
SRC_URI[github-com-mcandre-stank.sha256sum] = "a23883fe4dbd1d32a68940f3c37f3410731e728b038d70ef9b20e71463effdb8"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mcandre/stank/LICENSE.md;md5=6a55da1ae5d911566ba1a841e39c5a42 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-stank-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcandre-mx-sources.inc', '', 'github.com-mcandre-mx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-sh-v3-sources.inc', '', 'mvdan.cc-sh-v3-sources.inc', d)}
