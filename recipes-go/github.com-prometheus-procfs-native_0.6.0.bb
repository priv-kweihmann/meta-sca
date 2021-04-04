SUMMARY = "go.mod: github.com/prometheus/procfs"
HOMEPAGE = "https://pkg.go.dev/github.com/prometheus/procfs"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-prometheus-procfs-sources.inc

GO_IMPORT = "github.com/prometheus/procfs"

inherit gosrc
inherit native
