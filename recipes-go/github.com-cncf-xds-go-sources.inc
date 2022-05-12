SRC_URI += "https://proxy.golang.org/github.com/cncf/xds/go/@v/v0.0.0-20220511222645-42e9329d8a3a.zip;srcoutput=github.com/cncf/xds/go;srcinput=github.com/cncf/xds/go@v0.0.0-20220511222645-42e9329d8a3a;downloadfilename=github-com-cncf-xds-go-0.0.0-20220511222645-42e9329d8a3a.zip;name=github-com-cncf-xds-go"
SRC_URI[github-com-cncf-xds-go.sha256sum] = "b8001c8fe5f0d50d77c3c6a13984c6adfa7211ccf00dc922b59a362f5905d5ca"

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
