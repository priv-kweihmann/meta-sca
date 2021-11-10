SRC_URI += "https://proxy.golang.org/github.com/lib/pq/@v/v1.10.4.zip;srcoutput=github.com/lib/pq;srcinput=github.com/lib/pq@v1.10.4;downloadfilename=github-com-lib-pq-1.10.4.zip;name=github-com-lib-pq"
SRC_URI[github-com-lib-pq.sha256sum] = "93297b290a5bcc9a684a7f5ed7810820f2b7d294ea6561d8d5082440a72985d2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lib/pq/LICENSE.md;md5=0eab29964025b358179aa6d8f7db14bf \
"

GOSRC_INCLUDEGUARD += "github.com-lib-pq-sources.inc"

