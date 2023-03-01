SRC_URI += "https://proxy.golang.org/github.com/ugorji/go/@v/v1.2.10.zip;srcoutput=github.com/ugorji/go;srcinput=github.com/ugorji/go@v1.2.10;downloadfilename=github-com-ugorji-go-1.2.10.zip;name=github-com-ugorji-go"
SRC_URI[github-com-ugorji-go.sha256sum] = "128f14be3654148e6cadb6e3801bf11a0c9e644d5fbfb1cf6ceca24120dbc287"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ugorji/go/LICENSE;md5=f39cb00aceeac4bc5f861dc07456d5d5 \
"

GOSRC_INCLUDEGUARD += "github.com-ugorji-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ugorji-go-codec-sources.inc', '', 'github.com-ugorji-go-codec-sources.inc', d)}
