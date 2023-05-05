SRC_URI += "https://proxy.golang.org/github.com/lib/pq/@v/v1.10.9.zip;srcoutput=github.com/lib/pq;srcinput=github.com/lib/pq@v1.10.9;downloadfilename=github-com-lib-pq-1.10.9.zip;name=github-com-lib-pq"
SRC_URI[github-com-lib-pq.sha256sum] = "6791a7af67f846a86335350012c4efadd0850096ebf22350b7b20e01e216e6f2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lib/pq/LICENSE.md;md5=0eab29964025b358179aa6d8f7db14bf \
"

GOSRC_INCLUDEGUARD += "github.com-lib-pq-sources.inc"

