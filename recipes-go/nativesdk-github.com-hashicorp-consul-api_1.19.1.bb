SUMMARY = "go.mod: github.com/hashicorp/consul/api"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/consul/api"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-consul-api-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-hashicorp-go-cleanhttp \
    nativesdk-github.com-hashicorp-go-hclog \
    nativesdk-github.com-hashicorp-go-rootcerts \
    nativesdk-github.com-hashicorp-serf \
    nativesdk-github.com-mitchellh-mapstructure \
"
GO_IMPORT = "github.com/hashicorp/consul/api"
inherit gosrc
inherit nativesdk
