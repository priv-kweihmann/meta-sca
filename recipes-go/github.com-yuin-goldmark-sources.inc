SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.3.7.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.3.7;downloadfilename=github-com-yuin-goldmark-1.3.7.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "328fbf1e9fc787b864e2e98990e2280032d474d87d52dde39385ae6a81066bfe"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

