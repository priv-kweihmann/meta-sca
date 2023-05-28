SRC_URI += "https://proxy.golang.org/cloud.google.com/go/gkeconnect/@v/v0.7.1.zip;srcoutput=cloud.google.com/go/gkeconnect;srcinput=cloud.google.com/go/gkeconnect@v0.7.1;downloadfilename=cloud-google-com-go-gkeconnect-0.7.1.zip;name=cloud-google-com-go-gkeconnect"
SRC_URI[cloud-google-com-go-gkeconnect.sha256sum] = "6930f53a0457ab17b1fe9eb39d855274ec16342f58dbcad052fb93221615e28c"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/gkeconnect/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-gkeconnect-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
