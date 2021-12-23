SUMMARY = "go.mod: github.com/rcrowley/go-metrics"
HOMEPAGE = "https://pkg.go.dev/github.com/rcrowley/go-metrics"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-rcrowley-go-metrics-sources.inc

EXTRA_DEPENDS += "\
    github.com-stathat-go-native \
"

GO_IMPORT = "github.com/rcrowley/go-metrics"

inherit gosrc
inherit native
