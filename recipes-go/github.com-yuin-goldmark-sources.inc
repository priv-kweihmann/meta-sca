SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.6.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.6;downloadfilename=github-com-yuin-goldmark-1.4.6.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "e5027a70226f847fe129e65b15f99a3fe0230e9ee77c53ae4c4b52b5a860e513"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

