SUMMARY = "go.mod: github.com/performancecopilot/speed"
HOMEPAGE = "https://pkg.go.dev/github.com/performancecopilot/speed"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-performancecopilot-speed-sources.inc

GO_IMPORT = "github.com/performancecopilot/speed"

inherit gosrc
inherit native
