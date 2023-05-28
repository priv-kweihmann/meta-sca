SRC_URI += "https://proxy.golang.org/cloud.google.com/go/contactcenterinsights/@v/v1.7.1.zip;srcoutput=cloud.google.com/go/contactcenterinsights;srcinput=cloud.google.com/go/contactcenterinsights@v1.7.1;downloadfilename=cloud-google-com-go-contactcenterinsights-1.7.1.zip;name=cloud-google-com-go-contactcenterinsights"
SRC_URI[cloud-google-com-go-contactcenterinsights.sha256sum] = "fa98bce77d3bffca43d372b14fdb0b69366fd6592b7a15d696bcf3b3791b6b9f"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/contactcenterinsights/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-contactcenterinsights-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-longrunning-sources.inc', '', 'cloud.google.com-go-longrunning-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
