SRC_URI += "https://proxy.golang.org/github.com/fullstorydev/grpcurl/@v/v1.8.0.zip;srcoutput=github.com/fullstorydev/grpcurl;srcinput=github.com/fullstorydev/grpcurl@v1.8.0;downloadfilename=github-com-fullstorydev-grpcurl-1.8.0.zip;name=github-com-fullstorydev-grpcurl"
SRC_URI[github-com-fullstorydev-grpcurl.sha256sum] = "ca373b44e730c3140683e8604d97aa4ef8901bef5a8ea87af4ccc26d16a3d2c8"
GOSRC_REMOVEDIRS += "github.com/fullstorydev/grpcurl/cmd"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fullstorydev/grpcurl/LICENSE;md5=43d9662feb52d5a750ba4668f5a08f6b \
"

GOSRC_INCLUDEGUARD += "github.com-fullstorydev-grpcurl-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jhump-protoreflect-sources.inc', '', 'github.com-jhump-protoreflect-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
