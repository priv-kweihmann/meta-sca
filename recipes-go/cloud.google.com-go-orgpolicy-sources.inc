SRC_URI += "https://proxy.golang.org/cloud.google.com/go/orgpolicy/@v/v1.10.1.zip;srcoutput=cloud.google.com/go/orgpolicy;srcinput=cloud.google.com/go/orgpolicy@v1.10.1;downloadfilename=cloud-google-com-go-orgpolicy-1.10.1.zip;name=cloud-google-com-go-orgpolicy"
SRC_URI[cloud-google-com-go-orgpolicy.sha256sum] = "56008479b74f140a78a5f718c1ba9abedf5b6ecc5f5060d1d3608039f2cfeb20"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/orgpolicy/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-orgpolicy-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
