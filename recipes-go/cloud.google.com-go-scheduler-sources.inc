SRC_URI += "https://proxy.golang.org/cloud.google.com/go/scheduler/@v/v1.9.1.zip;srcoutput=cloud.google.com/go/scheduler;srcinput=cloud.google.com/go/scheduler@v1.9.1;downloadfilename=cloud-google-com-go-scheduler-1.9.1.zip;name=cloud-google-com-go-scheduler"
SRC_URI[cloud-google-com-go-scheduler.sha256sum] = "aa5c192de65f52a27b57a5e9d96dd5a294000fddc05ab5e8911f4872dfe60ec5"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/scheduler/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-scheduler-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
