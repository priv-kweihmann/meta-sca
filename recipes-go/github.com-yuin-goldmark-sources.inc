SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.5.5.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.5.5;downloadfilename=github-com-yuin-goldmark-1.5.5.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "7e8148ce97e43af3e8307970cd597f3063b10daebdba176a0ecb7f682cd568b7"
GOSRC_REMOVEDIRS += "github.com/yuin/goldmark/fuzz"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

