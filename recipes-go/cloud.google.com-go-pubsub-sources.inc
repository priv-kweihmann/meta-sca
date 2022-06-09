SRC_URI += "https://proxy.golang.org/cloud.google.com/go/pubsub/@v/v1.22.2.zip;srcoutput=cloud.google.com/go/pubsub;srcinput=cloud.google.com/go/pubsub@v1.22.2;downloadfilename=cloud-google-com-go-pubsub-1.22.2.zip;name=cloud-google-com-go-pubsub"
SRC_URI[cloud-google-com-go-pubsub.sha256sum] = "8ef8bde3b2e521e22aa75b1c027a423216b4d9a2240623c0ddbc1ce22c0e3159"
GOSRC_REMOVEDIRS += "cloud.google.com/go/pubsub/internal/longtest"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/pubsub/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-pubsub-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-iam-sources.inc', '', 'cloud.google.com-go-iam-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-sources.inc', '', 'cloud.google.com-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-googleapis-gax-go-v2-sources.inc', '', 'github.com-googleapis-gax-go-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.opencensus.io-sources.inc', '', 'go.opencensus.io-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-time-sources.inc', '', 'golang.org-x-time-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
