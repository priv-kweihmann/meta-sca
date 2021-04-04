SRC_URI += "https://proxy.golang.org/github.com/hashicorp/serf/@v/v0.9.5.zip;srcoutput=github.com/hashicorp/serf;srcinput=github.com/hashicorp/serf@v0.9.5;downloadfilename=github-com-hashicorp-serf-0.9.5.zip;name=github-com-hashicorp-serf"
SRC_URI[github-com-hashicorp-serf.sha256sum] = "b26c9916768043e9480615b4032f9f7d18ee2cdad6a7f75436570610df30fadf"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/serf/LICENSE;md5=b278a92d2c1509760384428817710378 \
    file://src/github.com/hashicorp/serf/website/LICENSE.md;md5=149208713ffdc3c5e3cb125f5c24d396 \
    file://src/github.com/hashicorp/serf/website/source/LICENSE;md5=98bf9062d6acf4993de70b52c1e59a70 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-serf-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-armon-circbuf-sources.inc', '', 'github.com-armon-circbuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-armon-go-metrics-sources.inc', '', 'github.com-armon-go-metrics-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-msgpack-sources.inc', '', 'github.com-hashicorp-go-msgpack-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-syslog-sources.inc', '', 'github.com-hashicorp-go-syslog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-logutils-sources.inc', '', 'github.com-hashicorp-logutils-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-mdns-sources.inc', '', 'github.com-hashicorp-mdns-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-memberlist-sources.inc', '', 'github.com-hashicorp-memberlist-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-cli-sources.inc', '', 'github.com-mitchellh-cli-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-mapstructure-sources.inc', '', 'github.com-mitchellh-mapstructure-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ryanuber-columnize-sources.inc', '', 'github.com-ryanuber-columnize-sources.inc', d)}
