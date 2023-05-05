SRC_URI += "https://proxy.golang.org/github.com/prometheus/client_model/@v/v0.4.0.zip;srcoutput=github.com/prometheus/client_model;srcinput=github.com/prometheus/client_model@v0.4.0;downloadfilename=github-com-prometheus-client-model-0.4.0.zip;name=github-com-prometheus-client-model"
SRC_URI[github-com-prometheus-client-model.sha256sum] = "93e312cfd357b420743c5f5534be6aed04fc860e7adb520dc2e879e055dba272"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/prometheus/client_model/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-prometheus-client-model-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
