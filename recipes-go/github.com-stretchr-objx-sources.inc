SRC_URI += "https://proxy.golang.org/github.com/stretchr/objx/@v/v0.5.2.zip;srcoutput=github.com/stretchr/objx;srcinput=github.com/stretchr/objx@v0.5.2;downloadfilename=github-com-stretchr-objx-0.5.2.zip;name=github-com-stretchr-objx"
SRC_URI[github-com-stretchr-objx.sha256sum] = "3c22c1d1c4c4024eb16a12f0187775640bf35d51b0a06649febc7797119451c0"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/stretchr/objx/LICENSE;md5=d023fd31d3ca39ec61eec65a91732735 \
"

GOSRC_INCLUDEGUARD += "github.com-stretchr-objx-sources.inc"

