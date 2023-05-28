SRC_URI += "https://proxy.golang.org/cloud.google.com/go/binaryauthorization/@v/v1.5.1.zip;srcoutput=cloud.google.com/go/binaryauthorization;srcinput=cloud.google.com/go/binaryauthorization@v1.5.1;downloadfilename=cloud-google-com-go-binaryauthorization-1.5.1.zip;name=cloud-google-com-go-binaryauthorization"
SRC_URI[cloud-google-com-go-binaryauthorization.sha256sum] = "84a4c1ff710b90fd91df8205964c362a484510cf9941575f69cc65effc6d8c71"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/binaryauthorization/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-binaryauthorization-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
