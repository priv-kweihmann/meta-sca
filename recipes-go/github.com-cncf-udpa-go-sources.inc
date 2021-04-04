SRC_URI += "https://proxy.golang.org/github.com/cncf/udpa/go/@v/v0.0.0-20210322005330-6414d713912e.zip;srcoutput=github.com/cncf/udpa/go;srcinput=github.com/cncf/udpa/go@v0.0.0-20210322005330-6414d713912e;downloadfilename=github-com-cncf-udpa-go-0.0.0-20210322005330-6414d713912e.zip;name=github-com-cncf-udpa-go"
SRC_URI[github-com-cncf-udpa-go.sha256sum] = "11c1c21f63fc7682200f3cdc637e93a7162e4a5cd82d5e492e6957c2ec3f4ce7"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cncf/udpa/go/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-cncf-udpa-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-envoyproxy-protoc-gen-validate-sources.inc', '', 'github.com-envoyproxy-protoc-gen-validate-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
