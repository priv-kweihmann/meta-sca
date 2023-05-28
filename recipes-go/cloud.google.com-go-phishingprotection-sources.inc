SRC_URI += "https://proxy.golang.org/cloud.google.com/go/phishingprotection/@v/v0.7.1.zip;srcoutput=cloud.google.com/go/phishingprotection;srcinput=cloud.google.com/go/phishingprotection@v0.7.1;downloadfilename=cloud-google-com-go-phishingprotection-0.7.1.zip;name=cloud-google-com-go-phishingprotection"
SRC_URI[cloud-google-com-go-phishingprotection.sha256sum] = "71b59021df44f48f3bf51cdce00d12530cadfd158ebe6c6a88882499d6739c23"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/phishingprotection/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-phishingprotection-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
