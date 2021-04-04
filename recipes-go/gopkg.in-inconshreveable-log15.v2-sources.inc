SRC_URI += "https://proxy.golang.org/gopkg.in/inconshreveable/log15.v2/@v/v2.0.0-20200109203555-b30bc20e4fd1.zip;srcoutput=gopkg.in/inconshreveable/log15.v2;srcinput=gopkg.in/inconshreveable/log15.v2@v2.0.0-20200109203555-b30bc20e4fd1;downloadfilename=gopkg-in-inconshreveable-log15-v2-2.0.0-20200109203555-b30bc20e4fd1.zip;name=gopkg-in-inconshreveable-log15-v2"
SRC_URI[gopkg-in-inconshreveable-log15-v2.sha256sum] = "7e6a0e61e0e685dd02586923a0945c0d82ebe09682242ca4fa76fd4f87680724"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/inconshreveable/log15.v2/LICENSE;md5=b23cff9db13f093a4e6ff77105cbd8eb \
    file://src/gopkg.in/inconshreveable/log15.v2/term/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
"

GOSRC_INCLUDEGUARD += "gopkg.in-inconshreveable-log15.v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-stack-stack-sources.inc', '', 'github.com-go-stack-stack-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-inconshreveable-log15-sources.inc', '', 'github.com-inconshreveable-log15-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-colorable-sources.inc', '', 'github.com-mattn-go-colorable-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
