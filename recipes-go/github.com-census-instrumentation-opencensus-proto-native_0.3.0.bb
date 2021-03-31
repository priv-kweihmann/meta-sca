SUMMARY = "go.mod: github.com/census-instrumentation/opencensus-proto"
HOMEPAGE = "https://pkg.go.dev/github.com/census-instrumentation/opencensus-proto"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-census-instrumentation-opencensus-proto-sources.inc

GO_IMPORT = "github.com/census-instrumentation/opencensus-proto"

inherit gosrc
inherit native
