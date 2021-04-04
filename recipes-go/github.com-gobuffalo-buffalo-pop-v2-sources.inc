SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/buffalo-pop/v2/@v/v2.3.0.zip;srcoutput=github.com/gobuffalo/buffalo-pop/v2;srcinput=github.com/gobuffalo/buffalo-pop/v2@v2.3.0;downloadfilename=github-com-gobuffalo-buffalo-pop-v2-2.3.0.zip;name=github-com-gobuffalo-buffalo-pop-v2"
SRC_URI[github-com-gobuffalo-buffalo-pop-v2.sha256sum] = "08988f1a4524671da431af574dd96caac97973edebfab042d22b57a8609672f9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/buffalo-pop/v2/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-buffalo-pop-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fatih-color-sources.inc', '', 'github.com-fatih-color-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-buffalo-sources.inc', '', 'github.com-gobuffalo-buffalo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-events-sources.inc', '', 'github.com-gobuffalo-events-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-flect-sources.inc', '', 'github.com-gobuffalo-flect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-genny-v2-sources.inc', '', 'github.com-gobuffalo-genny-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-packr-v2-sources.inc', '', 'github.com-gobuffalo-packr-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-plush-v4-sources.inc', '', 'github.com-gobuffalo-plush-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-pop-v5-sources.inc', '', 'github.com-gobuffalo-pop-v5-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-markbates-errx-sources.inc', '', 'github.com-markbates-errx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-cobra-sources.inc', '', 'github.com-spf13-cobra-sources.inc', d)}
