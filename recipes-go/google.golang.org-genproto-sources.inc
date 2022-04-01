SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20220331001556-c121b7875fbd.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20220331001556-c121b7875fbd;downloadfilename=google-golang-org-genproto-0.0.0-20220331001556-c121b7875fbd.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "1732df821bc452e83c7b7a1b547513e6320c04f8cdc44bf6df51b58b22a19c52"

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
