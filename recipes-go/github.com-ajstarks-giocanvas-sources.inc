SRC_URI += "https://proxy.golang.org/github.com/ajstarks/giocanvas/@v/v0.0.0-20221005112147-a4a3500715d7.zip;srcoutput=github.com/ajstarks/giocanvas;srcinput=github.com/ajstarks/giocanvas@v0.0.0-20221005112147-a4a3500715d7;downloadfilename=github-com-ajstarks-giocanvas-0.0.0-20221005112147-a4a3500715d7.zip;name=github-com-ajstarks-giocanvas"
SRC_URI[github-com-ajstarks-giocanvas.sha256sum] = "91c9520423f47947086f47fb978eb2f3ccd8fc4139d282c339ddb15e4e142d88"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/giocanvas/LICENSE;md5=e7f77fc5448ca7e87ca55a32855e25ff \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-giocanvas-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-sources.inc', '', 'gioui.org-sources.inc', d)}
