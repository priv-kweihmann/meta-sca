SRC_URI += "https://proxy.golang.org/github.com/ajstarks/giocanvas/@v/v0.0.0-20220601201109-4cd6a709dbdd.zip;srcoutput=github.com/ajstarks/giocanvas;srcinput=github.com/ajstarks/giocanvas@v0.0.0-20220601201109-4cd6a709dbdd;downloadfilename=github-com-ajstarks-giocanvas-0.0.0-20220601201109-4cd6a709dbdd.zip;name=github-com-ajstarks-giocanvas"
SRC_URI[github-com-ajstarks-giocanvas.sha256sum] = "22d34daa570e3ad8a20927eb505937ab06fc39444b85cb2d4b0479653b0ecf6d"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/giocanvas/LICENSE;md5=e7f77fc5448ca7e87ca55a32855e25ff \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-giocanvas-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-sources.inc', '', 'gioui.org-sources.inc', d)}
