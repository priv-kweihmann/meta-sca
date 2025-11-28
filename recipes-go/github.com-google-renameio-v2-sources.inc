SRC_URI += "https://proxy.golang.org/github.com/google/renameio/v2/@v/v2.0.1.zip;srcoutput=github.com/google/renameio/v2;srcinput=github.com/google/renameio/v2@v2.0.1;downloadfilename=github-com-google-renameio-v2-2.0.1.zip;name=github-com-google-renameio-v2"
SRC_URI[github-com-google-renameio-v2.sha256sum] = "09180b26600c651cf417ee8ba9fcb4d5602e5cc785df72f17ccd02b4c4641bd2"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://github.com/google/renameio/v2/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-renameio-v2-sources.inc"

