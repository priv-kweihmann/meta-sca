SRC_URI += "https://proxy.golang.org/github.com/prometheus/procfs/@v/v0.7.1.zip;srcoutput=github.com/prometheus/procfs;srcinput=github.com/prometheus/procfs@v0.7.1;downloadfilename=github-com-prometheus-procfs-0.7.1.zip;name=github-com-prometheus-procfs"
SRC_URI[github-com-prometheus-procfs.sha256sum] = "0d578a15f6790d5dd001434ef0b56d6457567a67be09b5569951123ff01b8014"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/prometheus/procfs/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-prometheus-procfs-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
