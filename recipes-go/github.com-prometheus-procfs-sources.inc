SRC_URI += "https://proxy.golang.org/github.com/prometheus/procfs/@v/v0.7.3.zip;srcoutput=github.com/prometheus/procfs;srcinput=github.com/prometheus/procfs@v0.7.3;downloadfilename=github-com-prometheus-procfs-0.7.3.zip;name=github-com-prometheus-procfs"
SRC_URI[github-com-prometheus-procfs.sha256sum] = "3e37c9f62738a493dd28283179d802749050353df0bca161df7cec4ed43e6f1a"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/prometheus/procfs/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-prometheus-procfs-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
