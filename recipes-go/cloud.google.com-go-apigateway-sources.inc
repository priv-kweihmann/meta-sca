SRC_URI += "https://proxy.golang.org/cloud.google.com/go/apigateway/@v/v1.6.0.zip;srcoutput=cloud.google.com/go/apigateway;srcinput=cloud.google.com/go/apigateway@v1.6.0;downloadfilename=cloud-google-com-go-apigateway-1.6.0.zip;name=cloud-google-com-go-apigateway"
SRC_URI[cloud-google-com-go-apigateway.sha256sum] = "e1821d9802f9a757c565fa5eadf1b3d3ab875187f4047345a97cd2e83f0286f6"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/apigateway/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-apigateway-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-longrunning-sources.inc', '', 'cloud.google.com-go-longrunning-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-googleapis-api-sources.inc', '', 'google.golang.org-genproto-googleapis-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
