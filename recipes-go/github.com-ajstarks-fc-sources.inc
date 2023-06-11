SRC_URI += "https://proxy.golang.org/github.com/ajstarks/fc/@v/v0.0.0-20230606144319-ef5d5cb73a3d.zip;srcoutput=github.com/ajstarks/fc;srcinput=github.com/ajstarks/fc@v0.0.0-20230606144319-ef5d5cb73a3d;downloadfilename=github-com-ajstarks-fc-0.0.0-20230606144319-ef5d5cb73a3d.zip;name=github-com-ajstarks-fc"
SRC_URI[github-com-ajstarks-fc.sha256sum] = "9aadd66cee0c0d28aa3bbc17bafa6f6f89ddb96cbd1c39656dd5e49c3ff2910a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/fc/LICENSE;md5=846db574dde037aa76bf9b9fe76b308e \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-fc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-fyne-sources.inc', '', 'fyne.io-fyne-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-fyne-v2-sources.inc', '', 'fyne.io-fyne-v2-sources.inc', d)}
