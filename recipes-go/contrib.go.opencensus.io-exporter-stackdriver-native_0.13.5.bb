SUMMARY = "go.mod: contrib.go.opencensus.io/exporter/stackdriver"
HOMEPAGE = "https://pkg.go.dev/contrib.go.opencensus.io/exporter/stackdriver"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require contrib.go.opencensus.io-exporter-stackdriver-sources.inc

GO_IMPORT = "contrib.go.opencensus.io/exporter/stackdriver"

inherit gosrc
inherit native
