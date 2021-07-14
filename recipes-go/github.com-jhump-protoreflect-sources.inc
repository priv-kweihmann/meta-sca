SRC_URI += "https://proxy.golang.org/github.com/jhump/protoreflect/@v/v1.9.0.zip;srcoutput=github.com/jhump/protoreflect;srcinput=github.com/jhump/protoreflect@v1.9.0;downloadfilename=github-com-jhump-protoreflect-1.9.0.zip;name=github-com-jhump-protoreflect"
SRC_URI[github-com-jhump-protoreflect.sha256sum] = "adff1b1018bcdcf61ace574118fec6b1911d940233740d40a5ebf1a014f5b10a"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jhump/protoreflect/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-jhump-protoreflect-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
