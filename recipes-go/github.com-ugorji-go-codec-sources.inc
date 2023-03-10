SRC_URI += "https://proxy.golang.org/github.com/ugorji/go/codec/@v/v1.2.11.zip;srcoutput=github.com/ugorji/go/codec;srcinput=github.com/ugorji/go/codec@v1.2.11;downloadfilename=github-com-ugorji-go-codec-1.2.11.zip;name=github-com-ugorji-go-codec"
SRC_URI[github-com-ugorji-go-codec.sha256sum] = "dd9dd3d866e519929866286429f6c75b4e90a45c05cc223cbdc6ed71dafa545f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ugorji/go/codec/LICENSE;md5=f39cb00aceeac4bc5f861dc07456d5d5 \
"

GOSRC_INCLUDEGUARD += "github.com-ugorji-go-codec-sources.inc"

