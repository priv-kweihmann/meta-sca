SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.2.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.2;downloadfilename=github-com-yuin-goldmark-1.4.2.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "ce9b4d4519fa0c89a79aea7f2452567b72b38682993790df45f9b1b5fefe52d5"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

