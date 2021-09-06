SRC_URI += "https://proxy.golang.org/github.com/lib/pq/@v/v1.10.3.zip;srcoutput=github.com/lib/pq;srcinput=github.com/lib/pq@v1.10.3;downloadfilename=github-com-lib-pq-1.10.3.zip;name=github-com-lib-pq"
SRC_URI[github-com-lib-pq.sha256sum] = "c76381332cdf13d33a87720c6259dc15fc63c797624b13221ff755f3f7bc778d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lib/pq/LICENSE.md;md5=0eab29964025b358179aa6d8f7db14bf \
"

GOSRC_INCLUDEGUARD += "github.com-lib-pq-sources.inc"

