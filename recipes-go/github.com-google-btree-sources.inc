SRC_URI += "https://proxy.golang.org/github.com/google/btree/@v/v1.1.1.zip;srcoutput=github.com/google/btree;srcinput=github.com/google/btree@v1.1.1;downloadfilename=github-com-google-btree-1.1.1.zip;name=github-com-google-btree"
SRC_URI[github-com-google-btree.sha256sum] = "63283da7837b4acce6b86abedc3e940d4d88d39420fa80406b71de270a793d10"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/btree/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-btree-sources.inc"

