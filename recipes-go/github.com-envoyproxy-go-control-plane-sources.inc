SRC_URI += "https://proxy.golang.org/github.com/envoyproxy/go-control-plane/@v/v0.9.8.zip;srcoutput=github.com/envoyproxy/go-control-plane;srcinput=github.com/envoyproxy/go-control-plane@v0.9.8;downloadfilename=github-com-envoyproxy-go-control-plane-0.9.8.zip;name=github-com-envoyproxy-go-control-plane"
SRC_URI[github-com-envoyproxy-go-control-plane.sha256sum] = "2ee5849552a1a5c794c705b2376e6b8f317d99a577f63743a60a93bfea8a2447"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/envoyproxy/go-control-plane/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"

GOSRC_INCLUDEGUARD += "github.com-envoyproxy-go-control-plane-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-census-instrumentation-opencensus-proto-sources.inc', '', 'github.com-census-instrumentation-opencensus-proto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cncf-udpa-go-sources.inc', '', 'github.com-cncf-udpa-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-envoyproxy-protoc-gen-validate-sources.inc', '', 'github.com-envoyproxy-protoc-gen-validate-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-client-model-sources.inc', '', 'github.com-prometheus-client-model-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
