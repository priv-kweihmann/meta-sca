SUMMARY = "go.mod: github.com/opentracing-contrib/go-observer"
HOMEPAGE = "https://pkg.go.dev/github.com/opentracing-contrib/go-observer"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-opentracing-contrib-go-observer-sources.inc

GO_IMPORT = "github.com/opentracing-contrib/go-observer"

inherit gosrc
inherit native
