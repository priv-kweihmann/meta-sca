SUMMARY = "go.mod: github.com/influxdata/influxdb1-client"
HOMEPAGE = "https://pkg.go.dev/github.com/influxdata/influxdb1-client"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-influxdata-influxdb1-client-sources.inc

GO_IMPORT = "github.com/influxdata/influxdb1-client"

inherit gosrc
inherit native
