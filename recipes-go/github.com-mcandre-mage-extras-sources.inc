SRC_URI += "https://proxy.golang.org/github.com/mcandre/mage-extras/@v/v0.0.42.zip;srcoutput=github.com/mcandre/mage-extras;srcinput=github.com/mcandre/mage-extras@v0.0.42;downloadfilename=github-com-mcandre-mage-extras-0.0.42.zip;name=github-com-mcandre-mage-extras"
SRC_URI[github-com-mcandre-mage-extras.sha256sum] = "79e38578d59c4b43d65f87c652ce320f5bb3550782f3a18411c6331234c3ef89"

GOSRC_LICENSE += "\
    0BSD \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mcandre/mage-extras/LICENSE.md;md5=d6aa0352b5ed761e76917cdcaa4f0aae \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-mage-extras-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magefile-mage-sources.inc', '', 'github.com-magefile-mage-sources.inc', d)}
