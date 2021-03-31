SRC_URI_append = " https://proxy.golang.org/github.com/golang/groupcache/@v/v0.0.0-20200121045136-8c9f03a8e57e.zip;srcoutput=github.com/golang/groupcache;srcinput=github.com/golang/groupcache@v0.0.0-20200121045136-8c9f03a8e57e;downloadfilename=github-com-golang-groupcache-0.0.0-20200121045136-8c9f03a8e57e.zip;name=github-com-golang-groupcache"
SRC_URI[github-com-golang-groupcache.sha256sum] = "5d3a47edd7d97bbaf8685ddb3271fdc9f4790134998b39016e5d63eca6d99599"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/golang/groupcache/LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5 \
"
