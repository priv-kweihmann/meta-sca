SRC_URI += "https://proxy.golang.org/cloud.google.com/go/assuredworkloads/@v/v1.11.0.zip;srcoutput=cloud.google.com/go/assuredworkloads;srcinput=cloud.google.com/go/assuredworkloads@v1.11.0;downloadfilename=cloud-google-com-go-assuredworkloads-1.11.0.zip;name=cloud-google-com-go-assuredworkloads"
SRC_URI[cloud-google-com-go-assuredworkloads.sha256sum] = "b00eb280c92f5bdedd002e60f97840f2330ac1a2be8d3f834882793660f05d85"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/assuredworkloads/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-assuredworkloads-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-longrunning-sources.inc', '', 'cloud.google.com-go-longrunning-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-googleapis-api-sources.inc', '', 'google.golang.org-genproto-googleapis-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
