SRC_URI += "https://proxy.golang.org/github.com/hashicorp/consul/api/@v/v1.21.0.zip;srcoutput=github.com/hashicorp/consul/api;srcinput=github.com/hashicorp/consul/api@v1.21.0;downloadfilename=github-com-hashicorp-consul-api-1.21.0.zip;name=github-com-hashicorp-consul-api"
SRC_URI[github-com-hashicorp-consul-api.sha256sum] = "199c67cd67cb6148afdeb7cf62ca257e54906864bda4e11882875d584f4c14eb"

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
