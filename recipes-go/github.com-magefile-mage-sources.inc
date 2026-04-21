SRC_URI += "https://proxy.golang.org/github.com/magefile/mage/@v/v1.17.1.zip;srcoutput=github.com/magefile/mage;srcinput=github.com/magefile/mage@v1.17.1;downloadfilename=github-com-magefile-mage-1.17.1.zip;name=github-com-magefile-mage"
SRC_URI[github-com-magefile-mage.sha256sum] = "cdd2cdaa168901af4a712f0e136e9fc3d4e5f0962ab0a5a6ea1b6e414d626bf0"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/magefile/mage/LICENSE;md5=02754c9de112baaa49870a35979afec1 \
    file://github.com/magefile/mage/site/themes/learn/LICENSE.md;md5=d85a9508f412725ab2557c84c0ddd70d \
    file://github.com/magefile/mage/site/themes/learn/exampleSite/LICENSE.md;md5=5d215825f58f54752ee9f60fb0034941 \
"

GOSRC_INCLUDEGUARD += "github.com-magefile-mage-sources.inc"

