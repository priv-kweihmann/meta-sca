SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.7.4.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.7.4;downloadfilename=github-com-yuin-goldmark-1.7.4.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "7e0a308bb016a245a6e20ed44f088b0a17b46ccac70e454735ae1575703a4816"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

