SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.5.3.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.5.3;downloadfilename=github-com-yuin-goldmark-1.5.3.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "df80d91d257c140ed03896cc7ffa7a9ef17bc51d385670a296fddcf4b49e0d45"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

