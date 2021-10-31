SRC_URI += "https://proxy.golang.org/github.com/aws/smithy-go/@v/v1.8.1.zip;srcoutput=github.com/aws/smithy-go;srcinput=github.com/aws/smithy-go@v1.8.1;downloadfilename=github-com-aws-smithy-go-1.8.1.zip;name=github-com-aws-smithy-go"
SRC_URI[github-com-aws-smithy-go.sha256sum] = "a3f8316c9ad38c18b3f210f5140a33d90a08c62940fb59e8bae5a13493e6b4f0"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/smithy-go/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-smithy-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
