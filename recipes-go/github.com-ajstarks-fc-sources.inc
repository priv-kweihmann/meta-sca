SRC_URI += "https://proxy.golang.org/github.com/ajstarks/fc/@v/v0.0.0-20220714115743-896a72d69224.zip;srcoutput=github.com/ajstarks/fc;srcinput=github.com/ajstarks/fc@v0.0.0-20220714115743-896a72d69224;downloadfilename=github-com-ajstarks-fc-0.0.0-20220714115743-896a72d69224.zip;name=github-com-ajstarks-fc"
SRC_URI[github-com-ajstarks-fc.sha256sum] = "88e6f31eac37b56f675c37a7ee9e747c11d41e0992104eb6ce18bed1bd5adacd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/fc/LICENSE;md5=846db574dde037aa76bf9b9fe76b308e \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-fc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-fyne-sources.inc', '', 'fyne.io-fyne-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-fyne-v2-sources.inc', '', 'fyne.io-fyne-v2-sources.inc', d)}
