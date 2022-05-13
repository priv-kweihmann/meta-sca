SRC_URI += "https://proxy.golang.org/go.opentelemetry.io/proto/otlp/@v/v0.16.0.zip;srcoutput=go.opentelemetry.io/proto/otlp;srcinput=go.opentelemetry.io/proto/otlp@v0.16.0;downloadfilename=go-opentelemetry-io-proto-otlp-0.16.0.zip;name=go-opentelemetry-io-proto-otlp"
SRC_URI[go-opentelemetry-io-proto-otlp.sha256sum] = "07f353eff504080aca115c4161651d47e7b9aa0b490415a92f7af5cfe60de005"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/go.opentelemetry.io/proto/otlp/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "go.opentelemetry.io-proto-otlp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-grpc-ecosystem-grpc-gateway-v2-sources.inc', '', 'github.com-grpc-ecosystem-grpc-gateway-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
