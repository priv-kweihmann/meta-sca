SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/envy/@v/v1.9.0.zip;srcoutput=github.com/gobuffalo/envy;srcinput=github.com/gobuffalo/envy@v1.9.0;downloadfilename=github-com-gobuffalo-envy-1.9.0.zip;name=github-com-gobuffalo-envy"
SRC_URI[github-com-gobuffalo-envy.sha256sum] = "e275fcd4d2b3a1d72f1ba4d05e0a2c882ceeb78907c54637946058f45deb9b31"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/envy/LICENSE.txt;md5=3871e79351e2d95f1acae275722846c2 \
    file://src/github.com/gobuffalo/envy/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-envy-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-joho-godotenv-sources.inc', '', 'github.com-joho-godotenv-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rogpeppe-go-internal-sources.inc', '', 'github.com-rogpeppe-go-internal-sources.inc', d)}
