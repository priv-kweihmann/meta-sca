SRC_URI += "https://proxy.golang.org/google.golang.org/genproto/@v/v0.0.0-20220414192740-2d67ff6cf2b4.zip;srcoutput=google.golang.org/genproto;srcinput=google.golang.org/genproto@v0.0.0-20220414192740-2d67ff6cf2b4;downloadfilename=google-golang-org-genproto-0.0.0-20220414192740-2d67ff6cf2b4.zip;name=google-golang-org-genproto"
SRC_URI[google-golang-org-genproto.sha256sum] = "02bfaedd488f1347476a9d039ab410d3fd1515f4ccebe70e92eaad47f49efe2c"

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
