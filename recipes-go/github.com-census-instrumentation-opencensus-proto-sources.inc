SRC_URI += "https://proxy.golang.org/github.com/census-instrumentation/opencensus-proto/@v/v0.4.1.zip;srcoutput=github.com/census-instrumentation/opencensus-proto;srcinput=github.com/census-instrumentation/opencensus-proto@v0.4.1;downloadfilename=github-com-census-instrumentation-opencensus-proto-0.4.1.zip;name=github-com-census-instrumentation-opencensus-proto"
SRC_URI[github-com-census-instrumentation-opencensus-proto.sha256sum] = "6fce66b7dcd2cba031ed9d73d77d6b21c2fe749c5de27cbb416a2d2cc1c68719"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/census-instrumentation/opencensus-proto/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-census-instrumentation-opencensus-proto-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-grpc-ecosystem-grpc-gateway-v2-sources.inc', '', 'github.com-grpc-ecosystem-grpc-gateway-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
