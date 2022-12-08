SRC_URI += "https://proxy.golang.org/github.com/ajstarks/giocanvas/@v/v0.0.0-20221128141302-29f4152934e3.zip;srcoutput=github.com/ajstarks/giocanvas;srcinput=github.com/ajstarks/giocanvas@v0.0.0-20221128141302-29f4152934e3;downloadfilename=github-com-ajstarks-giocanvas-0.0.0-20221128141302-29f4152934e3.zip;name=github-com-ajstarks-giocanvas"
SRC_URI[github-com-ajstarks-giocanvas.sha256sum] = "00486169ef81acd7671e067556fc14a4f7b69fa4801aa0eccb8962bfbcedfec0"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/giocanvas/LICENSE;md5=e7f77fc5448ca7e87ca55a32855e25ff \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-giocanvas-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-sources.inc', '', 'gioui.org-sources.inc', d)}
