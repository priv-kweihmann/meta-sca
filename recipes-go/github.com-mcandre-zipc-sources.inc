SRC_URI += "https://proxy.golang.org/github.com/mcandre/zipc/@v/v0.0.7.zip;srcoutput=github.com/mcandre/zipc;srcinput=github.com/mcandre/zipc@v0.0.7;downloadfilename=github-com-mcandre-zipc-0.0.7.zip;name=github-com-mcandre-zipc"
SRC_URI[github-com-mcandre-zipc.sha256sum] = "46424abeef29fcdc204c52565a1fbd27f56c69254cbab746cbc8cd94ce0feb5d"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mcandre/zipc/LICENSE.md;md5=6a55da1ae5d911566ba1a841e39c5a42 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-zipc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jhoonb-archivex-sources.inc', '', 'github.com-jhoonb-archivex-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcandre-mage-extras-sources.inc', '', 'github.com-mcandre-mage-extras-sources.inc', d)}
