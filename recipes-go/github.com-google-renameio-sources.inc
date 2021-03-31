SRC_URI_append = " https://proxy.golang.org/github.com/google/renameio/@v/v1.0.0.zip;srcoutput=github.com/google/renameio;srcinput=github.com/google/renameio@v1.0.0;downloadfilename=github-com-google-renameio-1.0.0.zip;name=github-com-google-renameio"
SRC_URI[github-com-google-renameio.sha256sum] = "eda9cf3d2245401817f23dd3719affcc957cb052ec85a546b0096d7a37db47e8"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/google/renameio/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
