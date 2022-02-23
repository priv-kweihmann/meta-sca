SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.7.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.7;downloadfilename=github-com-yuin-goldmark-1.4.7.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "b756af93ef6b737e120aeb3e67572e14f5fa2f0e38a41608023eb1dcf6bd6b58"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

