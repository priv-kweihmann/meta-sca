SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/googleapis/api/@v/v0.0.0-20230526203410-71b5a4ffd15e.zip;srcoutput=google.golang.org/genproto/googleapis/api;srcinput=google.golang.org/genproto/googleapis/api@v0.0.0-20230526203410-71b5a4ffd15e;downloadfilename=google-golang-org-genproto-googleapis-api-0.0.0-20230526203410-71b5a4ffd15e.zip;name=google-golang-org-genproto-googleapis-api"
SRC_URI[google-golang-org-genproto-googleapis-api.sha256sum] = "e633bddb308dd8b2aa1c6bb1f386e4748426ec593d044ed4d392a1048c3b08a6"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/google.golang.org/genproto/googleapis/api/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "google.golang.org-genproto-googleapis-api-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-googleapis-rpc-sources.inc', '', 'google.golang.org-genproto-googleapis-rpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
