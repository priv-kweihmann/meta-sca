SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.5.2.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.5.2;downloadfilename=github-com-yuin-goldmark-1.5.2.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "1d4ca0a84156a49823e8cabf785ffe2b9f6625bbc9db7528d5f9de3af0dcfb00"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

