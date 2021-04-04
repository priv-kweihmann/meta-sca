SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/attrs/@v/v1.0.0.zip;srcoutput=github.com/gobuffalo/attrs;srcinput=github.com/gobuffalo/attrs@v1.0.0;downloadfilename=github-com-gobuffalo-attrs-1.0.0.zip;name=github-com-gobuffalo-attrs"
SRC_URI[github-com-gobuffalo-attrs.sha256sum] = "bb7f84037cfb03b5ffe8bd1aaaada9f1c5addc3b42e8f68989963aa6a29a1cff"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/attrs/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-attrs-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-flect-sources.inc', '', 'github.com-gobuffalo-flect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
