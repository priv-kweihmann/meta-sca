SRC_URI += "https://proxy.golang.org/cloud.google.com/go/policytroubleshooter/@v/v1.6.1.zip;srcoutput=cloud.google.com/go/policytroubleshooter;srcinput=cloud.google.com/go/policytroubleshooter@v1.6.1;downloadfilename=cloud-google-com-go-policytroubleshooter-1.6.1.zip;name=cloud-google-com-go-policytroubleshooter"
SRC_URI[cloud-google-com-go-policytroubleshooter.sha256sum] = "10d67122f86509ec936fa73b0d4ed04138c229ba05ea2656a3c7ffbfa6953814"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/policytroubleshooter/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-policytroubleshooter-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-iam-sources.inc', '', 'cloud.google.com-go-iam-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
