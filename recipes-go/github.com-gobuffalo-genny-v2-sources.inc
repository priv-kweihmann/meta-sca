SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/genny/v2/@v/v2.0.6.zip;srcoutput=github.com/gobuffalo/genny/v2;srcinput=github.com/gobuffalo/genny/v2@v2.0.6;downloadfilename=github-com-gobuffalo-genny-v2-2.0.6.zip;name=github-com-gobuffalo-genny-v2"
SRC_URI[github-com-gobuffalo-genny-v2.sha256sum] = "e07bb7bbe95322dab343de44fc36740412929a25b9104fc5c86fd8f2c0de6c4b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/genny/v2/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-genny-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-logger-sources.inc', '', 'github.com-gobuffalo-logger-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-packd-sources.inc', '', 'github.com-gobuffalo-packd-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-plush-v4-sources.inc', '', 'github.com-gobuffalo-plush-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-markbates-oncer-sources.inc', '', 'github.com-markbates-oncer-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-markbates-safe-sources.inc', '', 'github.com-markbates-safe-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
