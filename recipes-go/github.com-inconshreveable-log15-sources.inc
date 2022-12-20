SRC_URI += "https://proxy.golang.org/github.com/inconshreveable/log15/@v/v3.0.0-testing.5+incompatible.zip;srcoutput=github.com/inconshreveable/log15;srcinput=github.com/inconshreveable/log15@v3.0.0-testing.5+incompatible;downloadfilename=github-com-inconshreveable-log15-3.0.0-testing.5+incompatible.zip;name=github-com-inconshreveable-log15"
SRC_URI[github-com-inconshreveable-log15.sha256sum] = "1380423648ad8bc31a0975ab6486683680f51af745478e7b2180933d17208c21"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/inconshreveable/log15/LICENSE;md5=b23cff9db13f093a4e6ff77105cbd8eb \
    file://src/github.com/inconshreveable/log15/term/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
"

GOSRC_INCLUDEGUARD += "github.com-inconshreveable-log15-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-stack-stack-sources.inc', '', 'github.com-go-stack-stack-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-colorable-sources.inc', '', 'github.com-mattn-go-colorable-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
