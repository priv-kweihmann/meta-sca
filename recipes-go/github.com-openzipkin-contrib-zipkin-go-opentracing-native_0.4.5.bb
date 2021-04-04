SUMMARY = "go.mod: github.com/openzipkin-contrib/zipkin-go-opentracing"
HOMEPAGE = "https://pkg.go.dev/github.com/openzipkin-contrib/zipkin-go-opentracing"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-openzipkin-contrib-zipkin-go-opentracing-sources.inc

GO_IMPORT = "github.com/openzipkin-contrib/zipkin-go-opentracing"

inherit gosrc
inherit native
