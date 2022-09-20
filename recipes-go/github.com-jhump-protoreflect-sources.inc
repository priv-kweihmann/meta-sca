SRC_URI += "https://proxy.golang.org/github.com/jhump/protoreflect/@v/v1.13.0.zip;srcoutput=github.com/jhump/protoreflect;srcinput=github.com/jhump/protoreflect@v1.13.0;downloadfilename=github-com-jhump-protoreflect-1.13.0.zip;name=github-com-jhump-protoreflect"
SRC_URI[github-com-jhump-protoreflect.sha256sum] = "e71965bc2d0593774a3e8c0fb3d88f8d55d8dc7e8a42c339fc2b2d4323a805e6"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jhump/protoreflect/LICENSE;md5=d2da9bb28165e303974a719a7e70bea5 \
"

GOSRC_INCLUDEGUARD += "github.com-jhump-protoreflect-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jhump-gopoet-sources.inc', '', 'github.com-jhump-gopoet-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jhump-goprotoc-sources.inc', '', 'github.com-jhump-goprotoc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
