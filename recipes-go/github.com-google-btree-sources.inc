SRC_URI += "https://proxy.golang.org/github.com/google/btree/@v/v1.0.1.zip;srcoutput=github.com/google/btree;srcinput=github.com/google/btree@v1.0.1;downloadfilename=github-com-google-btree-1.0.1.zip;name=github-com-google-btree"
SRC_URI[github-com-google-btree.sha256sum] = "9b9f66ca4eb36bb1867b5ff9134fb2eb9fe9717d44e28836f2e977f9c03b4128"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/btree/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-btree-sources.inc"

