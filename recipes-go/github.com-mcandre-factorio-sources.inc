SRC_URI += "https://proxy.golang.org/github.com/mcandre/factorio/@v/v0.0.4.zip;srcoutput=github.com/mcandre/factorio;srcinput=github.com/mcandre/factorio@v0.0.4;downloadfilename=github-com-mcandre-factorio-0.0.4.zip;name=github-com-mcandre-factorio"
SRC_URI[github-com-mcandre-factorio.sha256sum] = "9331ff73a663af4b808190f1dddada312a43359beba1e78b01a6233dd374c3fe"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mcandre/factorio/LICENSE.md;md5=df97b9c993d8fa7d8ea65d0c6f97fb0c \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-factorio-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcandre-mage-extras-sources.inc', '', 'github.com-mcandre-mage-extras-sources.inc', d)}
