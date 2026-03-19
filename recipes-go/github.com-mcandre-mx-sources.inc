SRC_URI += "https://proxy.golang.org/github.com/mcandre/mx/@v/v0.0.47.zip;srcoutput=github.com/mcandre/mx;srcinput=github.com/mcandre/mx@v0.0.47;downloadfilename=github-com-mcandre-mx-0.0.47.zip;name=github-com-mcandre-mx"
SRC_URI[github-com-mcandre-mx.sha256sum] = "57e60edc29f46ba51845dbfb036eac87a49f3f629054ff1a7063f2779af053db"

GOSRC_LICENSE += "\
    0BSD \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mcandre/mx/LICENSE.md;md5=d6aa0352b5ed761e76917cdcaa4f0aae \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-mx-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
