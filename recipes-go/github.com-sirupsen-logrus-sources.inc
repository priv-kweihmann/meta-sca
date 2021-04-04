SRC_URI += "https://proxy.golang.org/github.com/sirupsen/logrus/@v/v1.8.1.zip;srcoutput=github.com/sirupsen/logrus;srcinput=github.com/sirupsen/logrus@v1.8.1;downloadfilename=github-com-sirupsen-logrus-1.8.1.zip;name=github-com-sirupsen-logrus"
SRC_URI[github-com-sirupsen-logrus.sha256sum] = "8caec32e0aba1b95effc69d645b50f937137f78f0d0534b149f017dc0164a354"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/sirupsen/logrus/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
"

GOSRC_INCLUDEGUARD += "github.com-sirupsen-logrus-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
