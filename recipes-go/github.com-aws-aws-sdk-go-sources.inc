SRC_URI += "https://proxy.golang.org/github.com/aws/aws-sdk-go/@v/v1.40.57.zip;srcoutput=github.com/aws/aws-sdk-go;srcinput=github.com/aws/aws-sdk-go@v1.40.57;downloadfilename=github-com-aws-aws-sdk-go-1.40.57.zip;name=github-com-aws-aws-sdk-go"
SRC_URI[github-com-aws-aws-sdk-go.sha256sum] = "c034ed7cf607be46a7d285408fab89ca7e4aabac97716636b55552aa7a3e6a27"

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
