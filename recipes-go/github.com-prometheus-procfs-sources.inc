SRC_URI += "https://proxy.golang.org/github.com/prometheus/procfs/@v/v0.10.1.zip;srcoutput=github.com/prometheus/procfs;srcinput=github.com/prometheus/procfs@v0.10.1;downloadfilename=github-com-prometheus-procfs-0.10.1.zip;name=github-com-prometheus-procfs"
SRC_URI[github-com-prometheus-procfs.sha256sum] = "3f7a5c30bbcd2adcc7ec62896b69a3792ca1603cf0998fa06d2b872a74ed13b0"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/prometheus/procfs/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-prometheus-procfs-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
