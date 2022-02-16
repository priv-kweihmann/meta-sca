SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20220215190005-e57b466719ef.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20220215190005-e57b466719ef;downloadfilename=google-golang-org-genproto-0.0.0-20220215190005-e57b466719ef.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "c0bd0544a67a4e58b24d657bd1238afdd7bf3ebdd670567b6b91d2e1e7395486"

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
