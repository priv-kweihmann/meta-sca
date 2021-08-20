SRC_URI += "https://proxy.golang.org/github.com/cespare/xxhash/@v/v1.1.0.zip;srcoutput=github.com/cespare/xxhash;srcinput=github.com/cespare/xxhash@v1.1.0;downloadfilename=github-com-cespare-xxhash-1.1.0.zip;name=github-com-cespare-xxhash"
SRC_URI[github-com-cespare-xxhash.sha256sum] = "fe98c56670b21631f7fd3305a29a3b17e86a6cce3876a2119460717a18538e2e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cespare/xxhash/LICENSE.txt;md5=802da049c92a99b4387d3f3d91b00fa9 \
"

GOSRC_INCLUDEGUARD += "github.com-cespare-xxhash-sources.inc"

