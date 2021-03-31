SUMMARY = "go.mod: github.com/alexkohler/nargs"
HOMEPAGE = "https://pkg.go.dev/github.com/alexkohler/nargs"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-alexkohler-nargs-sources.inc

GO_IMPORT = "github.com/alexkohler/nargs"

inherit gosrc
inherit native
