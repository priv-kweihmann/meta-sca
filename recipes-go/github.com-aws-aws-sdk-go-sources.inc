SRC_URI_append = " https://proxy.golang.org/github.com/aws/aws-sdk-go/@v/v1.38.9.zip;srcoutput=github.com/aws/aws-sdk-go;srcinput=github.com/aws/aws-sdk-go@v1.38.9;downloadfilename=github-com-aws-aws-sdk-go-1.38.9.zip;name=github-com-aws-aws-sdk-go"
SRC_URI[github-com-aws-aws-sdk-go.sha256sum] = "b6fb5fbef051a80751e63fea794136ae77005db8a8809473b80a1b6dc25d9f6e"

MOD_LICENSE_append = " \
    Apache-2.0 \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/aws/aws-sdk-go/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/github.com/aws/aws-sdk-go/internal/sync/singleflight/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"
