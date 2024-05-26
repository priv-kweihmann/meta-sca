SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.7.1.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.7.1;downloadfilename=github-com-yuin-goldmark-1.7.1.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "9fc10085ddd27d39ccbd7e69ec3bfe7a456f61b3b11e5e03f96662b715c23952"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

