SRC_URI += "https://proxy.golang.org/github.com/nfnt/resize/@v/v0.0.0-20180221191011-83c6a9932646.zip;srcoutput=github.com/nfnt/resize;srcinput=github.com/nfnt/resize@v0.0.0-20180221191011-83c6a9932646;downloadfilename=github-com-nfnt-resize-0.0.0-20180221191011-83c6a9932646.zip;name=github-com-nfnt-resize"
SRC_URI[github-com-nfnt-resize.sha256sum] = "b8e97cb14e5e5ef29d762d2dff890f6279a125990ddf9cb7ae5c4d2a015b109c"

GOSRC_LICENSE += "\
    ISC \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/nfnt/resize/LICENSE;md5=c68c4dae4cf0c4e872b09a1a2fa65e68 \
"

GOSRC_INCLUDEGUARD += "github.com-nfnt-resize-sources.inc"

