SRC_URI_append = " https://proxy.golang.org/github.com/stretchr/objx/@v/v0.3.0.zip;srcoutput=github.com/stretchr/objx;srcinput=github.com/stretchr/objx@v0.3.0;downloadfilename=github-com-stretchr-objx-0.3.0.zip;name=github-com-stretchr-objx"
SRC_URI[github-com-stretchr-objx.sha256sum] = "21b63367c9f7e86a30383ee0bf4aa13b1bd3df890eef3529e351a692012946e5"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/stretchr/objx/LICENSE;md5=d023fd31d3ca39ec61eec65a91732735 \
"
