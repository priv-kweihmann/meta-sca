SRC_URI += "https://proxy.golang.org/github.com/google/renameio/v2/@v/v2.0.2.zip;srcoutput=github.com/google/renameio/v2;srcinput=github.com/google/renameio/v2@v2.0.2;downloadfilename=github-com-google-renameio-v2-2.0.2.zip;name=github-com-google-renameio-v2"
SRC_URI[github-com-google-renameio-v2.sha256sum] = "4ea1f7ec938cc2206827f129f40ed9a266f4df30198fcff08de07da4b72276cb"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://github.com/google/renameio/v2/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-renameio-v2-sources.inc"

