SRC_URI += "https://proxy.golang.org/github.com/lib/pq/@v/v1.10.2.zip;srcoutput=github.com/lib/pq;srcinput=github.com/lib/pq@v1.10.2;downloadfilename=github-com-lib-pq-1.10.2.zip;name=github-com-lib-pq"
SRC_URI[github-com-lib-pq.sha256sum] = "0f50cfc8d4ed4bbb39767aacc04d6b23e1105d2fa50dcb8e4ae204b2c90018f0"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lib/pq/LICENSE.md;md5=0eab29964025b358179aa6d8f7db14bf \
"

GOSRC_INCLUDEGUARD += "github.com-lib-pq-sources.inc"

