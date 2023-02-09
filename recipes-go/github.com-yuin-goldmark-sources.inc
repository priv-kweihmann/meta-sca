SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.5.4.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.5.4;downloadfilename=github-com-yuin-goldmark-1.5.4.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "7e4330dbd0b67eff8ebb1e5cd688df448f100c067ea0bda8ee554ef2ea13d3de"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

