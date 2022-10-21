SRC_URI += "https://proxy.golang.org/github.com/prometheus/client_model/@v/v0.3.0.zip;srcoutput=github.com/prometheus/client_model;srcinput=github.com/prometheus/client_model@v0.3.0;downloadfilename=github-com-prometheus-client-model-0.3.0.zip;name=github-com-prometheus-client-model"
SRC_URI[github-com-prometheus-client-model.sha256sum] = "2a1d147754959287fc34a7bb7c333b3d6fe0ca0d7db1606c49e8f48fd0311547"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/prometheus/client_model/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-prometheus-client-model-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
