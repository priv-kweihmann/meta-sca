SRC_URI += "https://proxy.golang.org/github.com/aws/smithy-go/@v/v1.11.2.zip;srcoutput=github.com/aws/smithy-go;srcinput=github.com/aws/smithy-go@v1.11.2;downloadfilename=github-com-aws-smithy-go-1.11.2.zip;name=github-com-aws-smithy-go"
SRC_URI[github-com-aws-smithy-go.sha256sum] = "62b6645d90fd3a5e55646ae1c361923491b95e7c008a6c1ff1e347232b0e55f6"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/smithy-go/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-smithy-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jmespath-go-jmespath-sources.inc', '', 'github.com-jmespath-go-jmespath-sources.inc', d)}
