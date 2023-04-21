SRC_URI += "https://proxy.golang.org/github.com/prometheus/client_golang/@v/v1.15.0.zip;srcoutput=github.com/prometheus/client_golang;srcinput=github.com/prometheus/client_golang@v1.15.0;downloadfilename=github-com-prometheus-client-golang-1.15.0.zip;name=github-com-prometheus-client-golang"
SRC_URI[github-com-prometheus-client-golang.sha256sum] = "1afad4f7eb62752dca6effbae203d0e129775f44c1c019c8bc7461822839ee6a"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/prometheus/client_golang/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-prometheus-client-golang-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-beorn7-perks-sources.inc', '', 'github.com-beorn7-perks-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cespare-xxhash-v2-sources.inc', '', 'github.com-cespare-xxhash-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-davecgh-go-spew-sources.inc', '', 'github.com-davecgh-go-spew-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-json-iterator-go-sources.inc', '', 'github.com-json-iterator-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-client-model-sources.inc', '', 'github.com-prometheus-client-model-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-common-sources.inc', '', 'github.com-prometheus-common-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-procfs-sources.inc', '', 'github.com-prometheus-procfs-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
