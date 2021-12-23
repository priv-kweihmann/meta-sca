SUMMARY = "go.mod: github.com/hashicorp/consul/api"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/consul/api"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-consul-api-sources.inc

EXTRA_DEPENDS += "\
    github.com-hashicorp-go-cleanhttp-native \
    github.com-hashicorp-go-hclog-native \
    github.com-hashicorp-go-rootcerts-native \
    github.com-hashicorp-serf-native \
    github.com-mitchellh-mapstructure-native \
"

GO_IMPORT = "github.com/hashicorp/consul/api"

inherit gosrc
inherit native
