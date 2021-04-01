SUMMARY = "go.mod: github.com/gertd/go-pluralize"
HOMEPAGE = "https://pkg.go.dev/github.com/gertd/go-pluralize"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gertd-go-pluralize-sources.inc

GO_IMPORT = "github.com/gertd/go-pluralize"

inherit gosrc
inherit native
