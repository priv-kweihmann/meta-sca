SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/logger/@v/v1.0.6.zip;srcoutput=github.com/gobuffalo/logger;srcinput=github.com/gobuffalo/logger@v1.0.6;downloadfilename=github-com-gobuffalo-logger-1.0.6.zip;name=github-com-gobuffalo-logger"
SRC_URI[github-com-gobuffalo-logger.sha256sum] = "59f40e6f53d93f79096e7bd7050c01f2eb35f45840221ff8830ebaa239e2320f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/logger/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-logger-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sirupsen-logrus-sources.inc', '', 'github.com-sirupsen-logrus-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
