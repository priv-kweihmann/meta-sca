SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.8.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.8;downloadfilename=github-com-yuin-goldmark-1.4.8.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "292fcd4e68f16041c6f07f8cf994d80801a1145367be7388072521d5657eff07"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

