SRC_URI += "https://proxy.golang.org/github.com/mcandre/factorio/@v/v0.0.3.zip;srcoutput=github.com/mcandre/factorio;srcinput=github.com/mcandre/factorio@v0.0.3;downloadfilename=github-com-mcandre-factorio-0.0.3.zip;name=github-com-mcandre-factorio"
SRC_URI[github-com-mcandre-factorio.sha256sum] = "ae71c0260df1d9b0d642f5c2dcc71580dee04e167c27d38afc4a2c8b222b3ca6"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mcandre/factorio/LICENSE.md;md5=df97b9c993d8fa7d8ea65d0c6f97fb0c \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-factorio-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mcandre-mage-extras-sources.inc', '', 'github.com-mcandre-mage-extras-sources.inc', d)}
