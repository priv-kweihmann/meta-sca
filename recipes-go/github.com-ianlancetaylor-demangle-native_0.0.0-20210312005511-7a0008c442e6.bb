SUMMARY = "go.mod: github.com/ianlancetaylor/demangle"
HOMEPAGE = "https://pkg.go.dev/github.com/ianlancetaylor/demangle"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ianlancetaylor-demangle-sources.inc

GO_IMPORT = "github.com/ianlancetaylor/demangle"

inherit gosrc
inherit native
