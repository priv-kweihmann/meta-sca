SRC_URI += "https://proxy.golang.org/github.com/stretchr/objx/@v/v0.8.0.zip;srcoutput=github.com/stretchr/objx;srcinput=github.com/stretchr/objx@v0.8.0;downloadfilename=github-com-stretchr-objx-0.8.0.zip;name=github-com-stretchr-objx"
SRC_URI[github-com-stretchr-objx.sha256sum] = "4c776cb1bc9f84b17e8b09a4438a6e3dc4943d02241e1db1192b547c34e3f5fe"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/stretchr/objx/LICENSE;md5=d023fd31d3ca39ec61eec65a91732735 \
"

GOSRC_INCLUDEGUARD += "github.com-stretchr-objx-sources.inc"

