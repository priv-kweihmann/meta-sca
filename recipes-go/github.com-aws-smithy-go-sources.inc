SRC_URI += "https://proxy.golang.org/github.com/aws/smithy-go/@v/v1.3.1.zip;srcoutput=github.com/aws/smithy-go;srcinput=github.com/aws/smithy-go@v1.3.1;downloadfilename=github-com-aws-smithy-go-1.3.1.zip;name=github-com-aws-smithy-go"
SRC_URI[github-com-aws-smithy-go.sha256sum] = "b3ea8f5d2debeb4c99ff918d7bc3292a7ab521aae99938c306f22a92161be1a9"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/smithy-go/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-smithy-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
