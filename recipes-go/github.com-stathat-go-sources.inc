SRC_URI += "https://proxy.golang.org/github.com/stathat/go/@v/v1.0.0.zip;srcoutput=github.com/stathat/go;srcinput=github.com/stathat/go@v1.0.0;downloadfilename=github-com-stathat-go-1.0.0.zip;name=github-com-stathat-go"
SRC_URI[github-com-stathat-go.sha256sum] = "482c4b3e5546078554512afeee6f36b2aa519e50756a4d36983b27c467d8840c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/stathat/go/LICENSE;md5=9b5c931572a8aa113ce83124dfbb7779 \
"

GOSRC_INCLUDEGUARD += "github.com-stathat-go-sources.inc"

