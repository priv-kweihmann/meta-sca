SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.11.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.11;downloadfilename=github-com-yuin-goldmark-1.4.11.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "5eeffa86e84f336c5b3bc03170219baf35437d07ba9a8b57934f227c5f35d7b5"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

