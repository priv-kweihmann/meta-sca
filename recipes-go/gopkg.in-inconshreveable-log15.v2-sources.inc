SRC_URI += "https://proxy.golang.org/gopkg.in/inconshreveable/log15.v2/@v/v2.0.0-20221122034931-555555054819.zip;srcoutput=gopkg.in/inconshreveable/log15.v2;srcinput=gopkg.in/inconshreveable/log15.v2@v2.0.0-20221122034931-555555054819;downloadfilename=gopkg-in-inconshreveable-log15-v2-2.0.0-20221122034931-555555054819.zip;name=gopkg-in-inconshreveable-log15-v2"
SRC_URI[gopkg-in-inconshreveable-log15-v2.sha256sum] = "c122deda23681f453823af9f15e56d1547d9761b05bd5eb81bcae7d8af1c30b1"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/inconshreveable/log15.v2/LICENSE;md5=b23cff9db13f093a4e6ff77105cbd8eb \
    file://src/gopkg.in/inconshreveable/log15.v2/term/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
"

GOSRC_INCLUDEGUARD += "gopkg.in-inconshreveable-log15.v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-inconshreveable-log15-sources.inc', '', 'github.com-inconshreveable-log15-sources.inc', d)}
