SRC_URI += "https://proxy.golang.org/github.com/ugorji/go/codec/@v/v1.2.9.zip;srcoutput=github.com/ugorji/go/codec;srcinput=github.com/ugorji/go/codec@v1.2.9;downloadfilename=github-com-ugorji-go-codec-1.2.9.zip;name=github-com-ugorji-go-codec"
SRC_URI[github-com-ugorji-go-codec.sha256sum] = "41c155a8c9959b77d459c552db2a688ca4e793d0ef90d4eb9eddb425f52efd1e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ugorji/go/codec/LICENSE;md5=f39cb00aceeac4bc5f861dc07456d5d5 \
"

GOSRC_INCLUDEGUARD += "github.com-ugorji-go-codec-sources.inc"

