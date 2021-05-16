SRC_URI += "https://proxy.golang.org/github.com/ugorji/go/codec/@v/v1.2.6.zip;srcoutput=github.com/ugorji/go/codec;srcinput=github.com/ugorji/go/codec@v1.2.6;downloadfilename=github-com-ugorji-go-codec-1.2.6.zip;name=github-com-ugorji-go-codec"
SRC_URI[github-com-ugorji-go-codec.sha256sum] = "793726e238ec0ae002e8b9465339db58aca8dab9cc94ebe8342c33900636b710"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ugorji/go/codec/LICENSE;md5=f39cb00aceeac4bc5f861dc07456d5d5 \
"

GOSRC_INCLUDEGUARD += "github.com-ugorji-go-codec-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ugorji-go-sources.inc', '', 'github.com-ugorji-go-sources.inc', d)}
