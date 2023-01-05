SRC_URI += "https://proxy.golang.org/github.com/ugorji/go/codec/@v/v1.2.8.zip;srcoutput=github.com/ugorji/go/codec;srcinput=github.com/ugorji/go/codec@v1.2.8;downloadfilename=github-com-ugorji-go-codec-1.2.8.zip;name=github-com-ugorji-go-codec"
SRC_URI[github-com-ugorji-go-codec.sha256sum] = "84c316abdd34485620c2e06fb50e128a8632e2102c1304d8592a523d902d661f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ugorji/go/codec/LICENSE;md5=f39cb00aceeac4bc5f861dc07456d5d5 \
"

GOSRC_INCLUDEGUARD += "github.com-ugorji-go-codec-sources.inc"

