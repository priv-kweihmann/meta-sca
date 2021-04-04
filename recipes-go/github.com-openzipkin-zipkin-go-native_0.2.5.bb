SUMMARY = "go.mod: github.com/openzipkin/zipkin-go"
HOMEPAGE = "https://pkg.go.dev/github.com/openzipkin/zipkin-go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-openzipkin-zipkin-go-sources.inc

GO_IMPORT = "github.com/openzipkin/zipkin-go"

inherit gosrc
inherit native
