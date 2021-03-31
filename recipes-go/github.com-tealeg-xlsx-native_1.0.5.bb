SUMMARY = "go.mod: github.com/tealeg/xlsx"
HOMEPAGE = "https://pkg.go.dev/github.com/tealeg/xlsx"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-tealeg-xlsx-sources.inc

GO_IMPORT = "github.com/tealeg/xlsx"

inherit gosrc
inherit native
