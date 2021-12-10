SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20211208223120-3a66f561d7aa.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20211208223120-3a66f561d7aa;downloadfilename=google-golang-org-genproto-0.0.0-20211208223120-3a66f561d7aa.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "065d31315a4c084daf0f63ff3f050484c1d957b46db68e5182c58b3b1930bcc4"

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
