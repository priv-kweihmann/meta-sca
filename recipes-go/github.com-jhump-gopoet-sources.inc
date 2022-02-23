SRC_URI += "https://proxy.golang.org/github.com/jhump/gopoet/@v/v0.1.0.zip;srcoutput=github.com/jhump/gopoet;srcinput=github.com/jhump/gopoet@v0.1.0;downloadfilename=github-com-jhump-gopoet-0.1.0.zip;name=github-com-jhump-gopoet"
SRC_URI[github-com-jhump-gopoet.sha256sum] = "7ca92311b09b985f859ceac67a8108360209c5535845ab6cd8cd4576c4dd9dff"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jhump/gopoet/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-jhump-gopoet-sources.inc"

