SRC_URI += "https://proxy.golang.org/github.com/ajstarks/fc/@v/v0.0.0-20220317125603-4129c66e12c7.zip;srcoutput=github.com/ajstarks/fc;srcinput=github.com/ajstarks/fc@v0.0.0-20220317125603-4129c66e12c7;downloadfilename=github-com-ajstarks-fc-0.0.0-20220317125603-4129c66e12c7.zip;name=github-com-ajstarks-fc"
SRC_URI[github-com-ajstarks-fc.sha256sum] = "eb31038fef6228c3a0c8e6ed69c4fdd8447af8009c327dd3b1ce1cd2279f08f9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/fc/LICENSE;md5=846db574dde037aa76bf9b9fe76b308e \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-fc-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-fyne-sources.inc', '', 'fyne.io-fyne-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'fyne.io-fyne-v2-sources.inc', '', 'fyne.io-fyne-v2-sources.inc', d)}
