SRC_URI += "https://proxy.golang.org/cloud.google.com/go/cloudtasks/@v/v1.11.0.zip;srcoutput=cloud.google.com/go/cloudtasks;srcinput=cloud.google.com/go/cloudtasks@v1.11.0;downloadfilename=cloud-google-com-go-cloudtasks-1.11.0.zip;name=cloud-google-com-go-cloudtasks"
SRC_URI[cloud-google-com-go-cloudtasks.sha256sum] = "0902533c3a51c69bcb45eea0f4f0df207882fcb2600a824ca2f3835c4a39c3cf"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/cloudtasks/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-cloudtasks-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-iam-sources.inc', '', 'cloud.google.com-go-iam-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-googleapis-api-sources.inc', '', 'google.golang.org-genproto-googleapis-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-googleapis-rpc-sources.inc', '', 'google.golang.org-genproto-googleapis-rpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
