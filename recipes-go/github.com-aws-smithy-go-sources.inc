SRC_URI += "https://proxy.golang.org/github.com/aws/smithy-go/@v/v1.11.1.zip;srcoutput=github.com/aws/smithy-go;srcinput=github.com/aws/smithy-go@v1.11.1;downloadfilename=github-com-aws-smithy-go-1.11.1.zip;name=github-com-aws-smithy-go"
SRC_URI[github-com-aws-smithy-go.sha256sum] = "c9f6acf83bfcc998c41afb5adf047785930010c1404b058c5a785fd582107d99"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/smithy-go/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-smithy-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jmespath-go-jmespath-sources.inc', '', 'github.com-jmespath-go-jmespath-sources.inc', d)}
