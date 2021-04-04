SUMMARY = "go.mod: github.com/olekukonko/tablewriter"
HOMEPAGE = "https://pkg.go.dev/github.com/olekukonko/tablewriter"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-olekukonko-tablewriter-sources.inc

GO_IMPORT = "github.com/olekukonko/tablewriter"

inherit gosrc
inherit native
