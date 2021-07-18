SRC_URI += "https://proxy.golang.org/github.com/aws/smithy-go/@v/v1.6.0.zip;srcoutput=github.com/aws/smithy-go;srcinput=github.com/aws/smithy-go@v1.6.0;downloadfilename=github-com-aws-smithy-go-1.6.0.zip;name=github-com-aws-smithy-go"
SRC_URI[github-com-aws-smithy-go.sha256sum] = "009493a267a0c4d2fc538d68e4ce5a24b9ffd01088e0ce78068755bddada1325"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/smithy-go/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-smithy-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
