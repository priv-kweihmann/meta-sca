SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20220707150051-590a5ac7bee1.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20220707150051-590a5ac7bee1;downloadfilename=google-golang-org-genproto-0.0.0-20220707150051-590a5ac7bee1.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "6145010fa7ec0c46e401cbdea8eac6d81138b3ba5d6a9a2a9cc22b1d23b598e7"

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
