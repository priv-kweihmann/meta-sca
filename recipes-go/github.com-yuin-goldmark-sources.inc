SRC_URI += "https://proxy.golang.org/github.com/yuin/goldmark/@v/v1.4.3.zip;srcoutput=github.com/yuin/goldmark;srcinput=github.com/yuin/goldmark@v1.4.3;downloadfilename=github-com-yuin-goldmark-1.4.3.zip;name=github-com-yuin-goldmark"
SRC_URI[github-com-yuin-goldmark.sha256sum] = "7a1bd1ffa2f1958810ff1e2319856fef445ba502fc9ae2dfb21410e1f6402db6"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yuin/goldmark/LICENSE;md5=9ccc571100d655d5a450059a79f1339e \
"

GOSRC_INCLUDEGUARD += "github.com-yuin-goldmark-sources.inc"

