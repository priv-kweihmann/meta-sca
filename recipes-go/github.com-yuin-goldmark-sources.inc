SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.3.8.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.3.8;downloadfilename=github-com-yuin-goldmark-1.3.8.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "a82021df70be8e6bfd6138aea3b352329eea81bc91eb5ad4dbd1a7b4ffc3372c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

