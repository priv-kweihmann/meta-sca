SRC_URI += "https://proxy.golang.org/github.com/aws/aws-sdk-go-v2/@v/v1.9.1.zip;srcoutput=github.com/aws/aws-sdk-go-v2;srcinput=github.com/aws/aws-sdk-go-v2@v1.9.1;downloadfilename=github-com-aws-aws-sdk-go-v2-1.9.1.zip;name=github-com-aws-aws-sdk-go-v2"
SRC_URI[github-com-aws-aws-sdk-go-v2.sha256sum] = "546b4f58c58aedf988945dc4709cf3af67a639ed94e0cf4df58389e9f9b345d8"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/aws-sdk-go-v2/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-aws-sdk-go-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aws-smithy-go-sources.inc', '', 'github.com-aws-smithy-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jmespath-go-jmespath-sources.inc', '', 'github.com-jmespath-go-jmespath-sources.inc', d)}
