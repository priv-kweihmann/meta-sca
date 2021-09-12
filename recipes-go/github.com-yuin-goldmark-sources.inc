SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.1.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.1;downloadfilename=github-com-yuin-goldmark-1.4.1.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "ba4763c06e40aaa865a0b90a1603f0be13174cc880acfad9640089c6ca9bd086"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

