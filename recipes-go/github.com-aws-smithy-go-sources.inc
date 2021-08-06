SRC_URI += "https://proxy.golang.org/github.com/aws/smithy-go/@v/v1.7.0.zip;srcoutput=github.com/aws/smithy-go;srcinput=github.com/aws/smithy-go@v1.7.0;downloadfilename=github-com-aws-smithy-go-1.7.0.zip;name=github-com-aws-smithy-go"
SRC_URI[github-com-aws-smithy-go.sha256sum] = "2da18dad80a9a13ed8cfc512b5c12512a250813b1af857f59b4437e5ba0ed311"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/smithy-go/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-smithy-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
