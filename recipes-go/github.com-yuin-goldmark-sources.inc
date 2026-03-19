SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.7.17.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.7.17;downloadfilename=github-com-yuin-goldmark-1.7.17.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "767b878bee332425b40b47cddf5eadc694c009d1f1d6897aa09f98feb1439042"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

