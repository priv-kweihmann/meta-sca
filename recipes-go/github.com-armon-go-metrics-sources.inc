SRC_URI += "https://proxy.golang.org/github.com/armon/go-metrics/@v/v0.3.8.zip;srcoutput=github.com/armon/go-metrics;srcinput=github.com/armon/go-metrics@v0.3.8;downloadfilename=github-com-armon-go-metrics-0.3.8.zip;name=github-com-armon-go-metrics"
SRC_URI[github-com-armon-go-metrics.sha256sum] = "c5155072f08976a293aa2d7209baef2e1343483010c0ff82473426729ee0f771"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/armon/go-metrics/LICENSE;md5=d2d77030c0183e3d1e66d26dc1f243be \
"

GOSRC_INCLUDEGUARD += "github.com-armon-go-metrics-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-circonus-labs-circonus-gometrics-sources.inc', '', 'github.com-circonus-labs-circonus-gometrics-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-datadog-datadog-go-sources.inc', '', 'github.com-datadog-datadog-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-immutable-radix-sources.inc', '', 'github.com-hashicorp-go-immutable-radix-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-client-golang-sources.inc', '', 'github.com-prometheus-client-golang-sources.inc', d)}
