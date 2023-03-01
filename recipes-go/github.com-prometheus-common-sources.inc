SRC_URI += "https://proxy.golang.org/github.com/prometheus/common/@v/v0.40.0.zip;srcoutput=github.com/prometheus/common;srcinput=github.com/prometheus/common@v0.40.0;downloadfilename=github-com-prometheus-common-0.40.0.zip;name=github-com-prometheus-common"
SRC_URI[github-com-prometheus-common.sha256sum] = "9dc9ec986afeaedcff50fb1d7b0edad4b8e039d90d8171151c78a1dd1588794f"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/prometheus/common/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-prometheus-common-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-kit-log-sources.inc', '', 'github.com-go-kit-log-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-json-iterator-go-sources.inc', '', 'github.com-json-iterator-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-julienschmidt-httprouter-sources.inc', '', 'github.com-julienschmidt-httprouter-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-matttproud-golang-protobuf-extensions-sources.inc', '', 'github.com-matttproud-golang-protobuf-extensions-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mwitkow-go-conntrack-sources.inc', '', 'github.com-mwitkow-go-conntrack-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-client-golang-sources.inc', '', 'github.com-prometheus-client-golang-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-client-model-sources.inc', '', 'github.com-prometheus-client-model-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-oauth2-sources.inc', '', 'golang.org-x-oauth2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-alecthomas-kingpin.v2-sources.inc', '', 'gopkg.in-alecthomas-kingpin.v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
