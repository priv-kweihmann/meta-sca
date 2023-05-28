SRC_URI += "https://proxy.golang.org/cloud.google.com/go/dataqna/@v/v0.7.1.zip;srcoutput=cloud.google.com/go/dataqna;srcinput=cloud.google.com/go/dataqna@v0.7.1;downloadfilename=cloud-google-com-go-dataqna-0.7.1.zip;name=cloud-google-com-go-dataqna"
SRC_URI[cloud-google-com-go-dataqna.sha256sum] = "9cd1253d50ff7310e452e6be2ac9e5aa97ce82c7973e504ef5ed7933c245b313"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/dataqna/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-dataqna-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
