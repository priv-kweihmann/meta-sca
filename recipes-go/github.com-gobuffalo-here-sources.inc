SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/here/@v/v0.6.2.zip;srcoutput=github.com/gobuffalo/here;srcinput=github.com/gobuffalo/here@v0.6.2;downloadfilename=github-com-gobuffalo-here-0.6.2.zip;name=github-com-gobuffalo-here"
SRC_URI[github-com-gobuffalo-here.sha256sum] = "e2d5da9b9a7da110981755a38b3a01dd7ab76197c14560f3abd31f2aad402cb7"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/here/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-here-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
