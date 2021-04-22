SRC_URI += "https://proxy.golang.org/github.com/lib/pq/@v/v1.10.1.zip;srcoutput=github.com/lib/pq;srcinput=github.com/lib/pq@v1.10.1;downloadfilename=github-com-lib-pq-1.10.1.zip;name=github-com-lib-pq"
SRC_URI[github-com-lib-pq.sha256sum] = "d244fd4dea82b0b83e969e768d905b13699d54dbc4863589862b2ede523ba3ab"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lib/pq/LICENSE.md;md5=0eab29964025b358179aa6d8f7db14bf \
"

GOSRC_INCLUDEGUARD += "github.com-lib-pq-sources.inc"

