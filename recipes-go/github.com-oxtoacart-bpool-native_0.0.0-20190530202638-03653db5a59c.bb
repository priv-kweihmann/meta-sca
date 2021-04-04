SUMMARY = "go.mod: github.com/oxtoacart/bpool"
HOMEPAGE = "https://pkg.go.dev/github.com/oxtoacart/bpool"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-oxtoacart-bpool-sources.inc

GO_IMPORT = "github.com/oxtoacart/bpool"

inherit gosrc
inherit native
