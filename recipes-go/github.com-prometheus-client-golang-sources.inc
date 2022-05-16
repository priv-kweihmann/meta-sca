SRC_URI += "https://proxy.golang.org/github.com/prometheus/client_golang/@v/v1.12.2.zip;srcoutput=github.com/prometheus/client_golang;srcinput=github.com/prometheus/client_golang@v1.12.2;downloadfilename=github-com-prometheus-client-golang-1.12.2.zip;name=github-com-prometheus-client-golang"
SRC_URI[github-com-prometheus-client-golang.sha256sum] = "f53066330cfc7c42acde416247033715ea6a7c70ef47cd9ea9609139aa409b45"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/prometheus/client_golang/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-prometheus-client-golang-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-beorn7-perks-sources.inc', '', 'github.com-beorn7-perks-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cespare-xxhash-v2-sources.inc', '', 'github.com-cespare-xxhash-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-json-iterator-go-sources.inc', '', 'github.com-json-iterator-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-client-model-sources.inc', '', 'github.com-prometheus-client-model-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-common-sources.inc', '', 'github.com-prometheus-common-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-procfs-sources.inc', '', 'github.com-prometheus-procfs-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
