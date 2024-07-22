SRC_URI += "https://proxy.golang.org/github.com/google/renameio/@v/v1.0.1.zip;srcoutput=github.com/google/renameio;srcinput=github.com/google/renameio@v1.0.1;downloadfilename=github-com-google-renameio-1.0.1.zip;name=github-com-google-renameio"
SRC_URI[github-com-google-renameio.sha256sum] = "846a437abb62928546377741fdfcd0cb583eb1a2f6e0f1fd983a02fe87d204c9"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://github.com/google/renameio/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-renameio-sources.inc"

