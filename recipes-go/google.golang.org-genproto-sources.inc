SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20220114231437-d2e6a121cae0.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20220114231437-d2e6a121cae0;downloadfilename=google-golang-org-genproto-0.0.0-20220114231437-d2e6a121cae0.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "941a4001010ab323e0f4b34645d156963baa54dd43aab1f8be60d5fdb2d14f49"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/google.golang.org/genproto/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "google.golang.org-genproto-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
