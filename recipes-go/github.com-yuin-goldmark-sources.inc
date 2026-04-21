SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.8.2.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.8.2;downloadfilename=github-com-yuin-goldmark-1.8.2.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "81da2e6eedc927ad59fa73d8690eab2e90828bde382b9eaa326a110f92c02d33"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

