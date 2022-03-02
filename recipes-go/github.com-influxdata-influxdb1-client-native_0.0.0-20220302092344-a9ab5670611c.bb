SUMMARY = "go.mod: github.com/influxdata/influxdb1-client"
HOMEPAGE = "https://pkg.go.dev/github.com/influxdata/influxdb1-client"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-influxdata-influxdb1-client-sources.inc

GO_IMPORT = "github.com/influxdata/influxdb1-client"

inherit gosrc
inherit native
