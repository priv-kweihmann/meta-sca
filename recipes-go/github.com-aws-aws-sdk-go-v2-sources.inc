SRC_URI += "https://proxy.golang.org/github.com/aws/aws-sdk-go-v2/@v/v1.3.3.zip;srcoutput=github.com/aws/aws-sdk-go-v2;srcinput=github.com/aws/aws-sdk-go-v2@v1.3.3;downloadfilename=github-com-aws-aws-sdk-go-v2-1.3.3.zip;name=github-com-aws-aws-sdk-go-v2"
SRC_URI[github-com-aws-aws-sdk-go-v2.sha256sum] = "5e2a988bdd8c74c92cbcbf26eed43668adfc837499cebdc2afa708ed9927696b"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/aws-sdk-go-v2/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-aws-sdk-go-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aws-smithy-go-sources.inc', '', 'github.com-aws-smithy-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jmespath-go-jmespath-sources.inc', '', 'github.com-jmespath-go-jmespath-sources.inc', d)}
