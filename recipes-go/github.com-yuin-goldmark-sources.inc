SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.5.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.5;downloadfilename=github-com-yuin-goldmark-1.4.5.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "6fdb183e103d1842e7c5cd266dc03388b565e051d2419db5fe19cc7677809d83"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

