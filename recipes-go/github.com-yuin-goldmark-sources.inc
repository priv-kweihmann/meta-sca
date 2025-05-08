SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.7.11.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.7.11;downloadfilename=github-com-yuin-goldmark-1.7.11.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "49b4d0e555cad5ec6653cd1ec9b0c4f56457d17b05e0fdd4178baf71581a0168"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

