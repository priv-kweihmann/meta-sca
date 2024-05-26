SRC_URI += "https://proxy.golang.org/github.com/boyter/lc/@v/v1.3.1.zip;srcoutput=github.com/boyter/lc;srcinput=github.com/boyter/lc@v1.3.1;downloadfilename=github-com-boyter-lc-1.3.1.zip;name=github-com-boyter-lc"
SRC_URI[github-com-boyter-lc.sha256sum] = "fa311055664a5682654d79d0ffe955ecd862a5e104abe8e3f781d4551fcd388c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/boyter/lc/LICENSE;md5=c80dc78b1efbb79817c0b2699aa1b357 \
"

GOSRC_INCLUDEGUARD += "github.com-boyter-lc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-boyter-golangvectorspace-sources.inc', '', 'github.com-boyter-golangvectorspace-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-briandowns-spinner-sources.inc', '', 'github.com-briandowns-spinner-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ryanuber-columnize-sources.inc', '', 'github.com-ryanuber-columnize-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-urfave-cli-sources.inc', '', 'github.com-urfave-cli-sources.inc', d)}
