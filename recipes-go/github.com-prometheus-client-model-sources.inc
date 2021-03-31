SRC_URI_append = " https://proxy.golang.org/github.com/prometheus/client_model/@v/v0.2.0.zip;srcoutput=github.com/prometheus/client_model;srcinput=github.com/prometheus/client_model@v0.2.0;downloadfilename=github-com-prometheus-client-model-0.2.0.zip;name=github-com-prometheus-client-model"
SRC_URI[github-com-prometheus-client-model.sha256sum] = "c3e0c48e8786a8cc4ff2de3d0fe3097f07f0e3882f827981c6371bf9cb449b5d"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/prometheus/client_model/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"
