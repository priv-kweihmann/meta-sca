SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/helpers/@v/v0.6.2.zip;srcoutput=github.com/gobuffalo/helpers;srcinput=github.com/gobuffalo/helpers@v0.6.2;downloadfilename=github-com-gobuffalo-helpers-0.6.2.zip;name=github-com-gobuffalo-helpers"
SRC_URI[github-com-gobuffalo-helpers.sha256sum] = "cccc219b499033f35df19f675f1f28c76a83cd4e5bef040949c598721a6cdaea"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/helpers/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
    file://src/github.com/gobuffalo/helpers/helpers/LICENSE;md5=650d488e190d4d61932b595f4fb64253 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-helpers-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-flect-sources.inc', '', 'github.com-gobuffalo-flect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-github-flavored-markdown-sources.inc', '', 'github.com-gobuffalo-github-flavored-markdown-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-tags-v3-sources.inc', '', 'github.com-gobuffalo-tags-v3-sources.inc', d)}
