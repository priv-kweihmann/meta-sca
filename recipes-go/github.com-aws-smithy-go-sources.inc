SRC_URI += "https://proxy.golang.org/github.com/aws/smithy-go/@v/v1.9.0.zip;srcoutput=github.com/aws/smithy-go;srcinput=github.com/aws/smithy-go@v1.9.0;downloadfilename=github-com-aws-smithy-go-1.9.0.zip;name=github-com-aws-smithy-go"
SRC_URI[github-com-aws-smithy-go.sha256sum] = "9c16069c7e37be3d310ee8123b7499f757364ee48a6ae833650346d1d640c119"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/aws/smithy-go/LICENSE;md5=34400b68072d710fecd0a2940a0d1658 \
"

GOSRC_INCLUDEGUARD += "github.com-aws-smithy-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
