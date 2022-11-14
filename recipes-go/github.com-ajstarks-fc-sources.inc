SRC_URI += "https://proxy.golang.org/github.com/ajstarks/fc/@v/v0.0.0-20221108203508-3143285ef3fe.zip;srcoutput=github.com/ajstarks/fc;srcinput=github.com/ajstarks/fc@v0.0.0-20221108203508-3143285ef3fe;downloadfilename=github-com-ajstarks-fc-0.0.0-20221108203508-3143285ef3fe.zip;name=github-com-ajstarks-fc"
SRC_URI[github-com-ajstarks-fc.sha256sum] = "729008cf33252af10d8b7d483dfb87522e72b42a6e77b6187c51e217a0be9a7a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/fc/LICENSE;md5=846db574dde037aa76bf9b9fe76b308e \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-fc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-fyne-sources.inc', '', 'fyne.io-fyne-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-fyne-v2-sources.inc', '', 'fyne.io-fyne-v2-sources.inc', d)}
