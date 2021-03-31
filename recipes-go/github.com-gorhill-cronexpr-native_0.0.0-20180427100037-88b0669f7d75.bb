SUMMARY = "go.mod: github.com/gorhill/cronexpr"
HOMEPAGE = "https://pkg.go.dev/github.com/gorhill/cronexpr"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gorhill-cronexpr-sources.inc

GO_IMPORT = "github.com/gorhill/cronexpr"

inherit gosrc
inherit native
