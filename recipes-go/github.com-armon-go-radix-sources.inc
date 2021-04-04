SRC_URI += "https://proxy.golang.org/github.com/armon/go-radix/@v/v1.0.0.zip;srcoutput=github.com/armon/go-radix;srcinput=github.com/armon/go-radix@v1.0.0;downloadfilename=github-com-armon-go-radix-1.0.0.zip;name=github-com-armon-go-radix"
SRC_URI[github-com-armon-go-radix.sha256sum] = "df93c816505baf12c3efe61328dc6f8fa42438f68f80b0b3725cae957d021c90"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/armon/go-radix/LICENSE;md5=cb04212e101fbbd028f325e04ad45778 \
"

GOSRC_INCLUDEGUARD += "github.com-armon-go-radix-sources.inc"

