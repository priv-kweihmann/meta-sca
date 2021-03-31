SRC_URI_append = " https://proxy.golang.org/github.com/prometheus/client_golang/@v/v1.10.0.zip;srcoutput=github.com/prometheus/client_golang;srcinput=github.com/prometheus/client_golang@v1.10.0;downloadfilename=github-com-prometheus-client-golang-1.10.0.zip;name=github-com-prometheus-client-golang"
SRC_URI[github-com-prometheus-client-golang.sha256sum] = "d3677f365b3c0b0ca9e4acd8a7c2ea9cff253246809a1e0ec7dd6a6ee35073a9"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/prometheus/client_golang/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"
