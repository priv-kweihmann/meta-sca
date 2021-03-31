SRC_URI_append = " https://proxy.golang.org/github.com/golang/mock/@v/v1.5.0.zip;srcoutput=github.com/golang/mock;srcinput=github.com/golang/mock@v1.5.0;downloadfilename=github-com-golang-mock-1.5.0.zip;name=github-com-golang-mock"
SRC_URI[github-com-golang-mock.sha256sum] = "87e7217adce199e9a3c2813174e221a4e06cde85b1423c7462b4fa422cbfbede"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/golang/mock/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
