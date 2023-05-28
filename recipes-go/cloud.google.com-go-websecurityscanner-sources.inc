SRC_URI += "https://proxy.golang.org/cloud.google.com/go/websecurityscanner/@v/v1.5.1.zip;srcoutput=cloud.google.com/go/websecurityscanner;srcinput=cloud.google.com/go/websecurityscanner@v1.5.1;downloadfilename=cloud-google-com-go-websecurityscanner-1.5.1.zip;name=cloud-google-com-go-websecurityscanner"
SRC_URI[cloud-google-com-go-websecurityscanner.sha256sum] = "2088018cc506e7b54c4c579768007de3b3fb826c3ea5a87ae5278fcc2037e8c7"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/websecurityscanner/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-websecurityscanner-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
