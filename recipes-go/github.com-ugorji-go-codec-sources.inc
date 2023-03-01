SRC_URI += "https://proxy.golang.org/github.com/ugorji/go/codec/@v/v1.2.10.zip;srcoutput=github.com/ugorji/go/codec;srcinput=github.com/ugorji/go/codec@v1.2.10;downloadfilename=github-com-ugorji-go-codec-1.2.10.zip;name=github-com-ugorji-go-codec"
SRC_URI[github-com-ugorji-go-codec.sha256sum] = "f915ac37fcf678ffd09fe509c4322ed2ea496ba2d26f4d1ee20de948f816735d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ugorji/go/codec/LICENSE;md5=f39cb00aceeac4bc5f861dc07456d5d5 \
"

GOSRC_INCLUDEGUARD += "github.com-ugorji-go-codec-sources.inc"

