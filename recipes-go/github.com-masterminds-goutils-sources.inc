SRC_URI += "https://github.com/Masterminds/goutils/archive/refs/tags/v1.1.1.zip;srcoutput=github.com/Masterminds/goutils;srcinput=goutils-1.1.1;downloadfilename=github-com-masterminds-goutils-1.1.1.zip;name=github-com-masterminds-goutils"
SRC_URI[github-com-masterminds-goutils.sha256sum] = "6f29a938db61209e1715934e78a7e1fcb6b7007e38ec7a6135b6504be89992e2"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Masterminds/goutils/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-masterminds-goutils-sources.inc"

