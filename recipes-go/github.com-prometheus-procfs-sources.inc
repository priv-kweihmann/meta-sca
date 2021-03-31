SRC_URI_append = " https://proxy.golang.org/github.com/prometheus/procfs/@v/v0.6.0.zip;srcoutput=github.com/prometheus/procfs;srcinput=github.com/prometheus/procfs@v0.6.0;downloadfilename=github-com-prometheus-procfs-0.6.0.zip;name=github-com-prometheus-procfs"
SRC_URI[github-com-prometheus-procfs.sha256sum] = "e7ec0d883ba2358a79e8e5267b00d76360680c7827eec6da0a7533b6dba92bfc"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/prometheus/procfs/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"
