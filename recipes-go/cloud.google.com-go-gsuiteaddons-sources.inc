SRC_URI += "https://proxy.golang.org/cloud.google.com/go/gsuiteaddons/@v/v1.5.1.zip;srcoutput=cloud.google.com/go/gsuiteaddons;srcinput=cloud.google.com/go/gsuiteaddons@v1.5.1;downloadfilename=cloud-google-com-go-gsuiteaddons-1.5.1.zip;name=cloud-google-com-go-gsuiteaddons"
SRC_URI[cloud-google-com-go-gsuiteaddons.sha256sum] = "bf7675936dfcc1a7b2d74f9516aa7ed86da5949cd20922c8f3730efd0ecb90ed"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/gsuiteaddons/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-gsuiteaddons-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
