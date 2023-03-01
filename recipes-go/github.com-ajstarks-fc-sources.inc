SRC_URI += "https://proxy.golang.org/github.com/ajstarks/fc/@v/v0.0.0-20230224115617-3b03de75e177.zip;srcoutput=github.com/ajstarks/fc;srcinput=github.com/ajstarks/fc@v0.0.0-20230224115617-3b03de75e177;downloadfilename=github-com-ajstarks-fc-0.0.0-20230224115617-3b03de75e177.zip;name=github-com-ajstarks-fc"
SRC_URI[github-com-ajstarks-fc.sha256sum] = "ad1909a6a45da3da1fd4624e5ff49d603d670b3936794036dfe868215eb71d50"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/fc/LICENSE;md5=846db574dde037aa76bf9b9fe76b308e \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-fc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-fyne-sources.inc', '', 'fyne.io-fyne-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-fyne-v2-sources.inc', '', 'fyne.io-fyne-v2-sources.inc', d)}
