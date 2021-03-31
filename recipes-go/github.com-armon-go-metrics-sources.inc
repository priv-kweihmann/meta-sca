SRC_URI_append = " https://proxy.golang.org/github.com/armon/go-metrics/@v/v0.3.6.zip;srcoutput=github.com/armon/go-metrics;srcinput=github.com/armon/go-metrics@v0.3.6;downloadfilename=github-com-armon-go-metrics-0.3.6.zip;name=github-com-armon-go-metrics"
SRC_URI[github-com-armon-go-metrics.sha256sum] = "ea9fd5f9a73e0b4d3119f77bb72b476319675e4bdec692c5675d33fb6bd1121f"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/armon/go-metrics/LICENSE;md5=d2d77030c0183e3d1e66d26dc1f243be \
"
