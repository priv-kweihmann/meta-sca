SRC_URI += "https://proxy.golang.org/github.com/aws/aws-sdk-go-v2/@v/v1.5.0.zip;srcoutput=github.com/aws/aws-sdk-go-v2;srcinput=github.com/aws/aws-sdk-go-v2@v1.5.0;downloadfilename=github-com-aws-aws-sdk-go-v2-1.5.0.zip;name=github-com-aws-aws-sdk-go-v2"
SRC_URI[github-com-aws-aws-sdk-go-v2.sha256sum] = "5b3d4eb0a74551a0a4afc962b50f18549e07d711893e68def72eac68beacc56e"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/aws-sdk-go-v2/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-aws-sdk-go-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aws-smithy-go-sources.inc', '', 'github.com-aws-smithy-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jmespath-go-jmespath-sources.inc', '', 'github.com-jmespath-go-jmespath-sources.inc', d)}
