SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/packr/v2/@v/v2.8.1.zip;srcoutput=github.com/gobuffalo/packr/v2;srcinput=github.com/gobuffalo/packr/v2@v2.8.1;downloadfilename=github-com-gobuffalo-packr-v2-2.8.1.zip;name=github-com-gobuffalo-packr-v2"
SRC_URI[github-com-gobuffalo-packr-v2.sha256sum] = "75fd46fd40d732d1aa5516e87dd5aec7cdf6889d0553252effc34c1e28f6b17e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/packr/v2/LICENSE.txt;md5=85a1cdcf71593cf8d843001b33ab4265 \
    file://src/github.com/gobuffalo/packr/v2/packr2/LICENSE;md5=b0836174c15c7c08968c60e3bd7cb556 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-packr-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-logger-sources.inc', '', 'github.com-gobuffalo-logger-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobuffalo-packd-sources.inc', '', 'github.com-gobuffalo-packd-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-karrick-godirwalk-sources.inc', '', 'github.com-karrick-godirwalk-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-markbates-errx-sources.inc', '', 'github.com-markbates-errx-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-markbates-oncer-sources.inc', '', 'github.com-markbates-oncer-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-markbates-safe-sources.inc', '', 'github.com-markbates-safe-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rogpeppe-go-internal-sources.inc', '', 'github.com-rogpeppe-go-internal-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-cobra-sources.inc', '', 'github.com-spf13-cobra-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
