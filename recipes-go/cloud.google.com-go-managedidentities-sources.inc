SRC_URI += "https://proxy.golang.org/cloud.google.com/go/managedidentities/@v/v1.6.0.zip;srcoutput=cloud.google.com/go/managedidentities;srcinput=cloud.google.com/go/managedidentities@v1.6.0;downloadfilename=cloud-google-com-go-managedidentities-1.6.0.zip;name=cloud-google-com-go-managedidentities"
SRC_URI[cloud-google-com-go-managedidentities.sha256sum] = "e1ca651988f08942395c702e6c141b372cf0f567831e3abd4a99e5a9bff27102"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/managedidentities/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-managedidentities-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-longrunning-sources.inc', '', 'cloud.google.com-go-longrunning-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-googleapis-api-sources.inc', '', 'google.golang.org-genproto-googleapis-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
