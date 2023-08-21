SRC_URI += "https://proxy.golang.org/github.com/stretchr/objx/@v/v0.5.1.zip;srcoutput=github.com/stretchr/objx;srcinput=github.com/stretchr/objx@v0.5.1;downloadfilename=github-com-stretchr-objx-0.5.1.zip;name=github-com-stretchr-objx"
SRC_URI[github-com-stretchr-objx.sha256sum] = "4c5e1aea52fde7fc97dc4a17d0ab50c390739d4d01d3d7edc2b067a50c6731e0"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/stretchr/objx/LICENSE;md5=d023fd31d3ca39ec61eec65a91732735 \
"

GOSRC_INCLUDEGUARD += "github.com-stretchr-objx-sources.inc"

