SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.10.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.10;downloadfilename=github-com-yuin-goldmark-1.4.10.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "694b93e45069656c3f25cd2936e9ad65ed4520534bbe3ad7f307b2eb0339a399"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

