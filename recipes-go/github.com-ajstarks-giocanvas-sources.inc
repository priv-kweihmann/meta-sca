SRC_URI += "https://proxy.golang.org/github.com/ajstarks/giocanvas/@v/v0.0.0-20221023171949-8dbd37767d08.zip;srcoutput=github.com/ajstarks/giocanvas;srcinput=github.com/ajstarks/giocanvas@v0.0.0-20221023171949-8dbd37767d08;downloadfilename=github-com-ajstarks-giocanvas-0.0.0-20221023171949-8dbd37767d08.zip;name=github-com-ajstarks-giocanvas"
SRC_URI[github-com-ajstarks-giocanvas.sha256sum] = "c312251f360fba6913b7de089f5550c40c2a48f2ed784d53a3cf31629ff5f4be"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ajstarks/giocanvas/LICENSE;md5=e7f77fc5448ca7e87ca55a32855e25ff \
"

GOSRC_INCLUDEGUARD += "github.com-ajstarks-giocanvas-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gioui.org-sources.inc', '', 'gioui.org-sources.inc', d)}
