SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20220422154200-b37d22cd5731.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20220422154200-b37d22cd5731;downloadfilename=google-golang-org-genproto-0.0.0-20220422154200-b37d22cd5731.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "201ad005a42adb569c45adae512d9e3b21b1304dbdff38d4dc648b1a3b67d655"

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
