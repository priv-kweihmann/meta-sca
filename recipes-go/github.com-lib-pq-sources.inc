SRC_URI += "https://proxy.golang.org/github.com/lib/pq/@v/v1.10.6.zip;srcoutput=github.com/lib/pq;srcinput=github.com/lib/pq@v1.10.6;downloadfilename=github-com-lib-pq-1.10.6.zip;name=github-com-lib-pq"
SRC_URI[github-com-lib-pq.sha256sum] = "7247dc4284bb572dd8bb3932ab1bf8a3de953882ade18c31a240838af8c73ee9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lib/pq/LICENSE.md;md5=0eab29964025b358179aa6d8f7db14bf \
"

GOSRC_INCLUDEGUARD += "github.com-lib-pq-sources.inc"

