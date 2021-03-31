SUMMARY = "go.mod: github.com/lib/pq"
HOMEPAGE = "https://pkg.go.dev/github.com/lib/pq"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-lib-pq-sources.inc

GO_IMPORT = "github.com/lib/pq"

inherit gosrc
inherit native
