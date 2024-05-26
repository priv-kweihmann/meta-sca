SRC_URI += "https://proxy.golang.org/github.com/google/renameio/v2/@v/v2.0.0.zip;srcoutput=github.com/google/renameio/v2;srcinput=github.com/google/renameio/v2@v2.0.0;downloadfilename=github-com-google-renameio-v2-2.0.0.zip;name=github-com-google-renameio-v2"
SRC_URI[github-com-google-renameio-v2.sha256sum] = "6e2b3ddcedd6bb5ff669b8e294befc9a35c01ede30fd00a183fc637ce7c9fd8e"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://github.com/google/renameio/v2/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-renameio-v2-sources.inc"

