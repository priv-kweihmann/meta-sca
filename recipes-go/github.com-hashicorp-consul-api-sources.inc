SRC_URI += "https://proxy.golang.org/github.com/hashicorp/consul/api/@v/v1.20.0.zip;srcoutput=github.com/hashicorp/consul/api;srcinput=github.com/hashicorp/consul/api@v1.20.0;downloadfilename=github-com-hashicorp-consul-api-1.20.0.zip;name=github-com-hashicorp-consul-api"
SRC_URI[github-com-hashicorp-consul-api.sha256sum] = "7deb2cb9da3bb36170428cca5c926afea00852a4c5d58c8fa431993fa737f6a6"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hashicorp/consul/api/LICENSE;md5=b8a277a612171b7526e9be072f405ef4 \
"

GOSRC_INCLUDEGUARD += "github.com-hashicorp-consul-api-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-cleanhttp-sources.inc', '', 'github.com-hashicorp-go-cleanhttp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-hclog-sources.inc', '', 'github.com-hashicorp-go-hclog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-rootcerts-sources.inc', '', 'github.com-hashicorp-go-rootcerts-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-serf-sources.inc', '', 'github.com-hashicorp-serf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-mapstructure-sources.inc', '', 'github.com-mitchellh-mapstructure-sources.inc', d)}
