SRC_URI += "https://proxy.golang.org/github.com/gin-contrib/sse/@v/v0.1.0.zip;srcoutput=github.com/gin-contrib/sse;srcinput=github.com/gin-contrib/sse@v0.1.0;downloadfilename=github-com-gin-contrib-sse-0.1.0.zip;name=github-com-gin-contrib-sse"
SRC_URI[github-com-gin-contrib-sse.sha256sum] = "512c8672f26405172077e764c4817ed8f66edc632d1bed205b5e1b8d282816ab"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gin-contrib/sse/LICENSE;md5=2e674b99ec94fcbd735f85c03ab8d74f \
"

GOSRC_INCLUDEGUARD += "github.com-gin-contrib-sse-sources.inc"

