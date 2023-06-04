SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/googleapis/bytestream/@v/v0.0.0-20230530153820-e85fd2cbaebc.zip;srcoutput=google.golang.org/genproto/googleapis/bytestream;srcinput=google.golang.org/genproto/googleapis/bytestream@v0.0.0-20230530153820-e85fd2cbaebc;downloadfilename=google-golang-org-genproto-googleapis-bytestream-0.0.0-20230530153820-e85fd2cbaebc.zip;name=google-golang-org-genproto-googleapis-bytestream"
SRC_URI[google-golang-org-genproto-googleapis-bytestream.sha256sum] = "cab1c8c198b4c5a226590e8b5b1b847e505a7aaf10a0145ce8c29951eca86b6a"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/google.golang.org/genproto/googleapis/bytestream/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "google.golang.org-genproto-googleapis-bytestream-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-googleapis-api-sources.inc', '', 'google.golang.org-genproto-googleapis-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
