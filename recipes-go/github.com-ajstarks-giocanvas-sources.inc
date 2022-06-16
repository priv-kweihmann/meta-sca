SRC_URI += "https://proxy.golang.org/github.com/ajstarks/giocanvas/@v/v0.0.0-20220616113837-30a6c6c1bd0e.zip;srcoutput=github.com/ajstarks/giocanvas;srcinput=github.com/ajstarks/giocanvas@v0.0.0-20220616113837-30a6c6c1bd0e;downloadfilename=github-com-ajstarks-giocanvas-0.0.0-20220616113837-30a6c6c1bd0e.zip;name=github-com-ajstarks-giocanvas"
SRC_URI[github-com-ajstarks-giocanvas.sha256sum] = "9bbf28dc85851e5cdc77f44da6d3f637fa4827dd6d61ac9a16a562a4c3fefa34"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/giocanvas/LICENSE;md5=e7f77fc5448ca7e87ca55a32855e25ff \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-giocanvas-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-sources.inc', '', 'gioui.org-sources.inc', d)}
