SRC_URI += "https://proxy.golang.org/github.com/cncf/xds/go/@v/v0.0.0-20220121163655-4a2b9fdd466b.zip;srcoutput=github.com/cncf/xds/go;srcinput=github.com/cncf/xds/go@v0.0.0-20220121163655-4a2b9fdd466b;downloadfilename=github-com-cncf-xds-go-0.0.0-20220121163655-4a2b9fdd466b.zip;name=github-com-cncf-xds-go"
SRC_URI[github-com-cncf-xds-go.sha256sum] = "5685f75602459a21e496350178d0f94fef894e4601f590b2c95359c7131a5add"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/cncf/xds/go/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-cncf-xds-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-envoyproxy-protoc-gen-validate-sources.inc', '', 'github.com-envoyproxy-protoc-gen-validate-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
