SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.3.9.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.3.9;downloadfilename=github-com-yuin-goldmark-1.3.9.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "bd45e55f07f6130b4bc12b882c8683febc7a85e6dde409939c4f80a45a177e67"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

