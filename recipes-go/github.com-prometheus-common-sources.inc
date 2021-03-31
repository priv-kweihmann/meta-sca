SRC_URI_append = " https://proxy.golang.org/github.com/prometheus/common/@v/v0.20.0.zip;srcoutput=github.com/prometheus/common;srcinput=github.com/prometheus/common@v0.20.0;downloadfilename=github-com-prometheus-common-0.20.0.zip;name=github-com-prometheus-common"
SRC_URI[github-com-prometheus-common.sha256sum] = "2cd73807150e3dec680d7728f0012c49ce8896cd1616866a3c142790c934f70f"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/prometheus/common/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"
