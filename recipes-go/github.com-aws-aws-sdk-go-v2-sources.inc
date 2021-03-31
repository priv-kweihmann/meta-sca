SRC_URI_append = " https://proxy.golang.org/github.com/aws/aws-sdk-go-v2/@v/v1.3.0.zip;srcoutput=github.com/aws/aws-sdk-go-v2;srcinput=github.com/aws/aws-sdk-go-v2@v1.3.0;downloadfilename=github-com-aws-aws-sdk-go-v2-1.3.0.zip;name=github-com-aws-aws-sdk-go-v2"
SRC_URI[github-com-aws-aws-sdk-go-v2.sha256sum] = "66b670fd1f0fc80c5dcf576004dc3bdd63bd1340ab2732eeeb5683b9121baae2"

MOD_LICENSE_append = " \
    Apache-2.0 \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/aws/aws-sdk-go-v2/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/github.com/aws/aws-sdk-go-v2/internal/sync/singleflight/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
