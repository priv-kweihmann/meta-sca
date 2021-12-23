SUMMARY = "go.mod: github.com/openzipkin-contrib/zipkin-go-opentracing"
HOMEPAGE = "https://pkg.go.dev/github.com/openzipkin-contrib/zipkin-go-opentracing"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-openzipkin-contrib-zipkin-go-opentracing-sources.inc

EXTRA_DEPENDS += "\
    github.com-opentracing-contrib-go-observer-native \
    github.com-opentracing-opentracing-go-native \
    github.com-openzipkin-zipkin-go-native \
"

GO_IMPORT = "github.com/openzipkin-contrib/zipkin-go-opentracing"

inherit gosrc
inherit native
