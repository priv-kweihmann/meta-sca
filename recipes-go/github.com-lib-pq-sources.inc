SRC_URI += "https://proxy.golang.org/github.com/lib/pq/@v/v1.10.7.zip;srcoutput=github.com/lib/pq;srcinput=github.com/lib/pq@v1.10.7;downloadfilename=github-com-lib-pq-1.10.7.zip;name=github-com-lib-pq"
SRC_URI[github-com-lib-pq.sha256sum] = "5d339f4296dcf650b4cec6b58e44988f8bbf7a4ca4bb9fff6e0421464efd7612"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lib/pq/LICENSE.md;md5=0eab29964025b358179aa6d8f7db14bf \
"

GOSRC_INCLUDEGUARD += "github.com-lib-pq-sources.inc"

