SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/logger/@v/v1.0.3.zip;srcoutput=github.com/gobuffalo/logger;srcinput=github.com/gobuffalo/logger@v1.0.3;downloadfilename=github-com-gobuffalo-logger-1.0.3.zip;name=github-com-gobuffalo-logger"
SRC_URI[github-com-gobuffalo-logger.sha256sum] = "49ba0f81f741519c48cc39a8fc2f0db4e4fe49873d4a98c75c584d2170c6003c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/logger/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-logger-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
