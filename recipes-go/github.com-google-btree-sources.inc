SRC_URI += "https://proxy.golang.org/github.com/google/btree/@v/v1.1.2.zip;srcoutput=github.com/google/btree;srcinput=github.com/google/btree@v1.1.2;downloadfilename=github-com-google-btree-1.1.2.zip;name=github-com-google-btree"
SRC_URI[github-com-google-btree.sha256sum] = "faee8550c5fffb4ae1dadde5ccaccb13298726f9fad226bb4eed0c03c90a481d"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/btree/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-btree-sources.inc"

