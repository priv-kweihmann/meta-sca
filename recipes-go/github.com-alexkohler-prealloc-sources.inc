SRC_URI_append = " https://proxy.golang.org/github.com/alexkohler/prealloc/@v/v1.0.0.zip;srcoutput=github.com/alexkohler/prealloc;srcinput=github.com/alexkohler/prealloc@v1.0.0;downloadfilename=github-com-alexkohler-prealloc-1.0.0.zip;name=github-com-alexkohler-prealloc"
SRC_URI[github-com-alexkohler-prealloc.sha256sum] = "3da3c6aebc2917ecd1322724060b6aa02f0fa83eb546e07809b94e1d687aeece"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/alexkohler/prealloc/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995 \
"
