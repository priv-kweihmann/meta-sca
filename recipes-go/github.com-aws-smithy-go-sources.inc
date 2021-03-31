SRC_URI_append = " https://proxy.golang.org/github.com/aws/smithy-go/@v/v1.2.0.zip;srcoutput=github.com/aws/smithy-go;srcinput=github.com/aws/smithy-go@v1.2.0;downloadfilename=github-com-aws-smithy-go-1.2.0.zip;name=github-com-aws-smithy-go"
SRC_URI[github-com-aws-smithy-go.sha256sum] = "ed61ace6c1f0aadfb0b94dcdd09058abadd3827bca6af789004681e25a6df053"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/aws/smithy-go/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"
