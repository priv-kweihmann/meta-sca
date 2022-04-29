SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20220426171045-31bebdecfb46.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20220426171045-31bebdecfb46;downloadfilename=google-golang-org-genproto-0.0.0-20220426171045-31bebdecfb46.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "7bfba8455a4f7eb1f0eba5ba71d627b559343e079da1c4b84e8cfba1cb6bab7a"

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
