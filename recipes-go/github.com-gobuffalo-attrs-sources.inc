SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/attrs/@v/v1.0.1.zip;srcoutput=github.com/gobuffalo/attrs;srcinput=github.com/gobuffalo/attrs@v1.0.1;downloadfilename=github-com-gobuffalo-attrs-1.0.1.zip;name=github-com-gobuffalo-attrs"
SRC_URI[github-com-gobuffalo-attrs.sha256sum] = "1b0d26f23c32e1c611e6886a6f417b15e378952e782227cba93ff7f6d71a1063"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/attrs/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-attrs-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-flect-sources.inc', '', 'github.com-gobuffalo-flect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
