SRC_URI += "https://proxy.golang.org/cloud.google.com/go/recaptchaenterprise/v2/@v/v2.7.2.zip;srcoutput=cloud.google.com/go/recaptchaenterprise/v2;srcinput=cloud.google.com/go/recaptchaenterprise/v2@v2.7.2;downloadfilename=cloud-google-com-go-recaptchaenterprise-v2-2.7.2.zip;name=cloud-google-com-go-recaptchaenterprise-v2"
SRC_URI[cloud-google-com-go-recaptchaenterprise-v2.sha256sum] = "53039d4652343769e0946e9a66e2c8a2cf9b68c6626ba09cc32c0785cc541a0d"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/recaptchaenterprise/v2/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-recaptchaenterprise-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-googleapis-api-sources.inc', '', 'google.golang.org-genproto-googleapis-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
