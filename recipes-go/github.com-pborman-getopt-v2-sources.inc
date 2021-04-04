SRC_URI += "https://proxy.golang.org/github.com/pborman/getopt/v2/@v/v2.1.0.zip;srcoutput=github.com/pborman/getopt/v2;srcinput=github.com/pborman/getopt/v2@v2.1.0;downloadfilename=github-com-pborman-getopt-v2-2.1.0.zip;name=github-com-pborman-getopt-v2"
SRC_URI[github-com-pborman-getopt-v2.sha256sum] = "f996782ef36ea87ca0acb47abe90d2642fca41a5badaffab9f60aa4942e5ed42"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pborman/getopt/v2/LICENSE;md5=b59bf459d18c24951156225311b63598 \
"

GOSRC_INCLUDEGUARD += "github.com-pborman-getopt-v2-sources.inc"

