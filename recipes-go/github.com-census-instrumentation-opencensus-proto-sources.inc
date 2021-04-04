SRC_URI += "https://proxy.golang.org/github.com/census-instrumentation/opencensus-proto/@v/v0.3.0.zip;srcoutput=github.com/census-instrumentation/opencensus-proto;srcinput=github.com/census-instrumentation/opencensus-proto@v0.3.0;downloadfilename=github-com-census-instrumentation-opencensus-proto-0.3.0.zip;name=github-com-census-instrumentation-opencensus-proto"
SRC_URI[github-com-census-instrumentation-opencensus-proto.sha256sum] = "579ab1ff19403579c3b438ab95528dfc691f0ff6076829f4ed2b2d2dc5b72552"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/census-instrumentation/opencensus-proto/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-census-instrumentation-opencensus-proto-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-grpc-ecosystem-grpc-gateway-sources.inc', '', 'github.com-grpc-ecosystem-grpc-gateway-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
