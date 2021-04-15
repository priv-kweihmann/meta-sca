SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.3.5.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.3.5;downloadfilename=github-com-yuin-goldmark-1.3.5.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "299f379635fab18f4a9681c37002dc66727049a41a68f19b79f9e6a604f71e09"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

