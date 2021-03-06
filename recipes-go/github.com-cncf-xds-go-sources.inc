SRC_URI += "https://proxy.golang.org/github.com/cncf/xds/go/@v/v0.0.0-20210323124008-b88cc788a63e.zip;srcoutput=github.com/cncf/xds/go;srcinput=github.com/cncf/xds/go@v0.0.0-20210323124008-b88cc788a63e;downloadfilename=github-com-cncf-xds-go-0.0.0-20210323124008-b88cc788a63e.zip;name=github-com-cncf-xds-go"
SRC_URI[github-com-cncf-xds-go.sha256sum] = "d8e9f88df9c76cfc6533d0f48533328ac5c701fa48ab6bb091c3fa622b940e70"

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
