SUMMARY = "go.mod: github.com/prometheus/client_golang"
HOMEPAGE = "https://pkg.go.dev/github.com/prometheus/client_golang"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-prometheus-client-golang-sources.inc

GO_IMPORT = "github.com/prometheus/client_golang"

inherit gosrc
inherit native
