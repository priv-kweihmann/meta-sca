SRC_URI += "https://proxy.golang.org/cloud.google.com/go/recaptchaenterprise/@v/v1.3.1.zip;srcoutput=cloud.google.com/go/recaptchaenterprise;srcinput=cloud.google.com/go/recaptchaenterprise@v1.3.1;downloadfilename=cloud-google-com-go-recaptchaenterprise-1.3.1.zip;name=cloud-google-com-go-recaptchaenterprise"
SRC_URI[cloud-google-com-go-recaptchaenterprise.sha256sum] = "81b75b9d1cb2b24878ee83f540e2e50ad9669f916ddaf76112d3c88ee71e7e3b"
GOSRC_REMOVEDIRS += "cloud.google.com/go/recaptchaenterprise/apiv1"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/recaptchaenterprise/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-recaptchaenterprise-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
