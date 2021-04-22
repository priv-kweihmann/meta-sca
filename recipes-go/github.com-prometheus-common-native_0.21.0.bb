SUMMARY = "go.mod: github.com/prometheus/common"
HOMEPAGE = "https://pkg.go.dev/github.com/prometheus/common"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-prometheus-common-sources.inc

GO_IMPORT = "github.com/prometheus/common"

inherit gosrc
inherit native
