SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.5.6.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.5.6;downloadfilename=github-com-yuin-goldmark-1.5.6.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "f13dda977b4ccd847d1ab6b6b79b75782e9a259eb7b547e4f2fa28c59430ac44"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

