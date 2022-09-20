SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20220919141832-68c03719ef51.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20220919141832-68c03719ef51;downloadfilename=google-golang-org-genproto-0.0.0-20220919141832-68c03719ef51.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "943cec0d7d2e2fdc6e9293bded5c110446683f79de765c2dacd467a517876e94"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/google.golang.org/genproto/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "google.golang.org-genproto-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-asset-sources.inc', '', 'cloud.google.com-go-asset-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-security-sources.inc', '', 'cloud.google.com-go-security-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
