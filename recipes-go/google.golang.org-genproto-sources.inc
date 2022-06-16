SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20220615141314-f1464d18c36b.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20220615141314-f1464d18c36b;downloadfilename=google-golang-org-genproto-0.0.0-20220615141314-f1464d18c36b.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "fbcaa4356f5f6905f28f9d850d6ab520a7359957184198e0fe313d9e994f0aa5"

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
