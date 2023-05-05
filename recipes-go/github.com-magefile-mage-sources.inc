SRC_URI += "https://proxy.golang.org/github.com/magefile/mage/@v/v1.14.0.zip;srcoutput=github.com/magefile/mage;srcinput=github.com/magefile/mage@v1.14.0;downloadfilename=github-com-magefile-mage-1.14.0.zip;name=github-com-magefile-mage"
SRC_URI[github-com-magefile-mage.sha256sum] = "0eae7df6ff7a25a69e0b78c8a8caa302e97ee5d604c65fcadaf55d29bbdec212"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/magefile/mage/LICENSE;md5=02754c9de112baaa49870a35979afec1 \
    file://src/github.com/magefile/mage/site/themes/learn/LICENSE.md;md5=d85a9508f412725ab2557c84c0ddd70d \
    file://src/github.com/magefile/mage/site/themes/learn/exampleSite/LICENSE.md;md5=5d215825f58f54752ee9f60fb0034941 \
"

GOSRC_INCLUDEGUARD += "github.com-magefile-mage-sources.inc"

