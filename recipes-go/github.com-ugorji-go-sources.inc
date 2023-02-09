SRC_URI += "https://proxy.golang.org/github.com/ugorji/go/@v/v1.2.9.zip;srcoutput=github.com/ugorji/go;srcinput=github.com/ugorji/go@v1.2.9;downloadfilename=github-com-ugorji-go-1.2.9.zip;name=github-com-ugorji-go"
SRC_URI[github-com-ugorji-go.sha256sum] = "bad0fdf63275a66015dd05709bf9e64c9f24c69ecd57e75d102dd667d54b6551"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ugorji/go/LICENSE;md5=f39cb00aceeac4bc5f861dc07456d5d5 \
"

GOSRC_INCLUDEGUARD += "github.com-ugorji-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ugorji-go-codec-sources.inc', '', 'github.com-ugorji-go-codec-sources.inc', d)}
