SRC_URI_append = " https://proxy.golang.org/github.com/sirupsen/logrus/@v/v1.8.1.zip;srcoutput=github.com/sirupsen/logrus;srcinput=github.com/sirupsen/logrus@v1.8.1;downloadfilename=github-com-sirupsen-logrus-1.8.1.zip;name=github-com-sirupsen-logrus"
SRC_URI[github-com-sirupsen-logrus.sha256sum] = "8caec32e0aba1b95effc69d645b50f937137f78f0d0534b149f017dc0164a354"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/sirupsen/logrus/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
"
