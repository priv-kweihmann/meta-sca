SRC_URI_append = " https://proxy.golang.org/cloud.google.com/go/spanner/@v/v1.16.0.zip;srcoutput=cloud.google.com/go/spanner;srcinput=cloud.google.com/go/spanner@v1.16.0;downloadfilename=cloud-google-com-go-spanner-1.16.0.zip;name=cloud-google-com-go-spanner"
SRC_URI[cloud-google-com-go-spanner.sha256sum] = "17db6e2541dcac19e02cadb2f15869d944f8be130f1d139357bdcf3a2b4df156"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/cloud.google.com/go/spanner/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
