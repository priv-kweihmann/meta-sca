SRC_URI += "https://proxy.golang.org/github.com/stretchr/objx/@v/v0.5.0.zip;srcoutput=github.com/stretchr/objx;srcinput=github.com/stretchr/objx@v0.5.0;downloadfilename=github-com-stretchr-objx-0.5.0.zip;name=github-com-stretchr-objx"
SRC_URI[github-com-stretchr-objx.sha256sum] = "1a00b3bb5ad41cb72634ace06b7eb7df857404d77a7cab4e401a7c729561fe4c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/stretchr/objx/LICENSE;md5=d023fd31d3ca39ec61eec65a91732735 \
"

GOSRC_INCLUDEGUARD += "github.com-stretchr-objx-sources.inc"

