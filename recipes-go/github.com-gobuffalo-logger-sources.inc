SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/logger/@v/v1.0.4.zip;srcoutput=github.com/gobuffalo/logger;srcinput=github.com/gobuffalo/logger@v1.0.4;downloadfilename=github-com-gobuffalo-logger-1.0.4.zip;name=github-com-gobuffalo-logger"
SRC_URI[github-com-gobuffalo-logger.sha256sum] = "ed20a3426ed2ef534910fc23c2447f6e13d2668651f0df91713efd9581cdd3de"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/logger/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-logger-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
