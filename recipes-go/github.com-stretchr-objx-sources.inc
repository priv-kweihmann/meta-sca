SRC_URI += "https://proxy.golang.org/github.com/stretchr/objx/@v/v0.4.0.zip;srcoutput=github.com/stretchr/objx;srcinput=github.com/stretchr/objx@v0.4.0;downloadfilename=github-com-stretchr-objx-0.4.0.zip;name=github-com-stretchr-objx"
SRC_URI[github-com-stretchr-objx.sha256sum] = "fb5c74373b4385e57e900b2a9ddec7ba1eda2c0d93fab4d307c15097dcaa0765"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/stretchr/objx/LICENSE;md5=d023fd31d3ca39ec61eec65a91732735 \
"

GOSRC_INCLUDEGUARD += "github.com-stretchr-objx-sources.inc"

