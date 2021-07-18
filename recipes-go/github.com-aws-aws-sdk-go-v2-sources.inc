SRC_URI += "https://proxy.golang.org/github.com/aws/aws-sdk-go-v2/@v/v1.7.1.zip;srcoutput=github.com/aws/aws-sdk-go-v2;srcinput=github.com/aws/aws-sdk-go-v2@v1.7.1;downloadfilename=github-com-aws-aws-sdk-go-v2-1.7.1.zip;name=github-com-aws-aws-sdk-go-v2"
SRC_URI[github-com-aws-aws-sdk-go-v2.sha256sum] = "312c3bbbcbdfe2b33d066792327c0704e785a745062e276aa1fba1a036c9e99c"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/aws-sdk-go-v2/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-aws-sdk-go-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aws-smithy-go-sources.inc', '', 'github.com-aws-smithy-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jmespath-go-jmespath-sources.inc', '', 'github.com-jmespath-go-jmespath-sources.inc', d)}
