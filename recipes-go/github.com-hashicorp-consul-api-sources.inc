SRC_URI += "https://proxy.golang.org/github.com/hashicorp/consul/api/@v/v1.12.0.zip;srcoutput=github.com/hashicorp/consul/api;srcinput=github.com/hashicorp/consul/api@v1.12.0;downloadfilename=github-com-hashicorp-consul-api-1.12.0.zip;name=github-com-hashicorp-consul-api"
SRC_URI[github-com-hashicorp-consul-api.sha256sum] = "baad5dc08a0e1f0121a436291336e39bcf2dbfc9cc9c6862832d97175ffb04de"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/consul/api/LICENSE;md5=b278a92d2c1509760384428817710378 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-consul-api-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-cleanhttp-sources.inc', '', 'github.com-hashicorp-go-cleanhttp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-hclog-sources.inc', '', 'github.com-hashicorp-go-hclog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-rootcerts-sources.inc', '', 'github.com-hashicorp-go-rootcerts-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-serf-sources.inc', '', 'github.com-hashicorp-serf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-mapstructure-sources.inc', '', 'github.com-mitchellh-mapstructure-sources.inc', d)}
