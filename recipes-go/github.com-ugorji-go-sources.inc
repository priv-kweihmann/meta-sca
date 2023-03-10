SRC_URI += "https://proxy.golang.org/github.com/ugorji/go/@v/v1.2.11.zip;srcoutput=github.com/ugorji/go;srcinput=github.com/ugorji/go@v1.2.11;downloadfilename=github-com-ugorji-go-1.2.11.zip;name=github-com-ugorji-go"
SRC_URI[github-com-ugorji-go.sha256sum] = "a20fd92b5ae1f845fe2715a1e09af068217beb055adb72e86e1f4d29e06c3e37"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ugorji/go/LICENSE;md5=f39cb00aceeac4bc5f861dc07456d5d5 \
"

GOSRC_INCLUDEGUARD += "github.com-ugorji-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ugorji-go-codec-sources.inc', '', 'github.com-ugorji-go-codec-sources.inc', d)}
