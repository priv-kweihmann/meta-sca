SUMMARY = "go.mod: github.com/hashicorp/golang-lru"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/golang-lru"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-golang-lru-sources.inc

GO_IMPORT = "github.com/hashicorp/golang-lru"

inherit gosrc
inherit native
