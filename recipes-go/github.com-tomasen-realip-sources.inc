SRC_URI_append = " https://proxy.golang.org/github.com/tomasen/realip/@v/v0.0.0-20180522021738-f0c99a92ddce.zip;srcoutput=github.com/tomasen/realip;srcinput=github.com/tomasen/realip@v0.0.0-20180522021738-f0c99a92ddce;downloadfilename=github-com-tomasen-realip-0.0.0-20180522021738-f0c99a92ddce.zip;name=github-com-tomasen-realip"
SRC_URI[github-com-tomasen-realip.sha256sum] = "cfb071871db31d0262d51bef042aa16f516a12325cd8985bf9d849d8e307320e"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/tomasen/realip/LICENSE;md5=40dcf5b63afc5dd031c9733e46b8c4f1 \
"
