SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20210920155426-26f343e4c215.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20210920155426-26f343e4c215;downloadfilename=google-golang-org-genproto-0.0.0-20210920155426-26f343e4c215.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "92cd460aa6c618f2896dc3d050320b7f1e468fa013e0864d96bbde3a89055c0a"

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
