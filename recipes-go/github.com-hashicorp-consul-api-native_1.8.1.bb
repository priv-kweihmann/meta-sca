SUMMARY = "go.mod: github.com/hashicorp/consul/api"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/consul/api"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-consul-api-sources.inc

GO_IMPORT = "github.com/hashicorp/consul/api"

inherit gosrc
inherit native
