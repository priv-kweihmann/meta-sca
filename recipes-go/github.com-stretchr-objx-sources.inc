SRC_URI += "https://proxy.golang.org/github.com/stretchr/objx/@v/v0.5.3.zip;srcoutput=github.com/stretchr/objx;srcinput=github.com/stretchr/objx@v0.5.3;downloadfilename=github-com-stretchr-objx-0.5.3.zip;name=github-com-stretchr-objx"
SRC_URI[github-com-stretchr-objx.sha256sum] = "cdc804051b06efceea75ee9b0b6349d2f92f17cd46c6193c4a8dfb0f51465a44"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/stretchr/objx/LICENSE;md5=d023fd31d3ca39ec61eec65a91732735 \
"

GOSRC_INCLUDEGUARD += "github.com-stretchr-objx-sources.inc"

