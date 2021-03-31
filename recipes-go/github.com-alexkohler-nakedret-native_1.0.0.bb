SUMMARY = "go.mod: github.com/alexkohler/nakedret"
HOMEPAGE = "https://pkg.go.dev/github.com/alexkohler/nakedret"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-alexkohler-nakedret-sources.inc

GO_IMPORT = "github.com/alexkohler/nakedret"

inherit gosrc
inherit native
