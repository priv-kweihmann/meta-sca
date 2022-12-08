SRC_URI += "https://proxy.golang.org/github.com/cespare/xxhash/v2/@v/v2.2.0.zip;srcoutput=github.com/cespare/xxhash/v2;srcinput=github.com/cespare/xxhash/v2@v2.2.0;downloadfilename=github-com-cespare-xxhash-v2-2.2.0.zip;name=github-com-cespare-xxhash-v2"
SRC_URI[github-com-cespare-xxhash-v2.sha256sum] = "fc180cdb0c00fbffbd39b774a72cdb5f0c32ace25370d5135195918a8c3fbd25"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cespare/xxhash/v2/LICENSE.txt;md5=802da049c92a99b4387d3f3d91b00fa9 \
"

GOSRC_INCLUDEGUARD += "github.com-cespare-xxhash-v2-sources.inc"

