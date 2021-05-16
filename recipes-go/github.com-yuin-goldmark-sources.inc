SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.3.6.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.3.6;downloadfilename=github-com-yuin-goldmark-1.3.6.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "34c579c6464b663a17fbf97b49fdec0f2d344ffafc8ae108c5b90948aa3e9a64"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

