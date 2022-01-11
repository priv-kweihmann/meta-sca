SRC_URI += "https://proxy.golang.org/github.com/aws/aws-sdk-go/@v/v1.42.31.zip;srcoutput=github.com/aws/aws-sdk-go;srcinput=github.com/aws/aws-sdk-go@v1.42.31;downloadfilename=github-com-aws-aws-sdk-go-1.42.31.zip;name=github-com-aws-aws-sdk-go"
SRC_URI[github-com-aws-aws-sdk-go.sha256sum] = "26bb654eaa2f6f65f523bc6764c0aea41b864fb52b4de7608dd955e88bd7ddc6"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/aws-sdk-go/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/github.com/aws/aws-sdk-go/internal/sync/singleflight/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-aws-sdk-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jmespath-go-jmespath-sources.inc', '', 'github.com-jmespath-go-jmespath-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
