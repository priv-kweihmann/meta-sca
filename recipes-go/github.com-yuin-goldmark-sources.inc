SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.7.8.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.7.8;downloadfilename=github-com-yuin-goldmark-1.7.8.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "a3b80d641264c40cac795f578066fa20c7cd17d2f0abdc6c5e6f5771a68cdcb8"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

