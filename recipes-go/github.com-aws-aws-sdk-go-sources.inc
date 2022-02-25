SRC_URI += "https://proxy.golang.org/github.com/aws/aws-sdk-go/@v/v1.43.6.zip;srcoutput=github.com/aws/aws-sdk-go;srcinput=github.com/aws/aws-sdk-go@v1.43.6;downloadfilename=github-com-aws-aws-sdk-go-1.43.6.zip;name=github-com-aws-aws-sdk-go"
SRC_URI[github-com-aws-aws-sdk-go.sha256sum] = "10008fd58d916b169d85ecba0d7778f4851d7d51de85ee0e3aac72e635eca870"

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
