SRC_URI_append = " https://proxy.golang.org/github.com/lib/pq/@v/v1.10.0.zip;srcoutput=github.com/lib/pq;srcinput=github.com/lib/pq@v1.10.0;downloadfilename=github-com-lib-pq-1.10.0.zip;name=github-com-lib-pq"
SRC_URI[github-com-lib-pq.sha256sum] = "2915ecf4f453a466d3d030af85599440ef5fe68274cfe0a1d0bebe8f73371547"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/lib/pq/LICENSE.md;md5=0eab29964025b358179aa6d8f7db14bf \
"
