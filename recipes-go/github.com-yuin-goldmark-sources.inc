SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.6.0.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.6.0;downloadfilename=github-com-yuin-goldmark-1.6.0.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "ae4c5dd68fa2d373b194db77504dfa66bd0868f718594d77fb52cdea13dc1185"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

