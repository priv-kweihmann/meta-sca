SUMMARY = "go.mod: github.com/shirou/gopsutil"
HOMEPAGE = "https://pkg.go.dev/github.com/shirou/gopsutil"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-shirou-gopsutil-sources.inc

GO_IMPORT = "github.com/shirou/gopsutil"

inherit gosrc
inherit native
