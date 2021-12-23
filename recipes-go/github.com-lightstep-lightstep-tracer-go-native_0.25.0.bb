SUMMARY = "go.mod: github.com/lightstep/lightstep-tracer-go"
HOMEPAGE = "https://pkg.go.dev/github.com/lightstep/lightstep-tracer-go"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-lightstep-lightstep-tracer-go-sources.inc

EXTRA_DEPENDS += "\
    github.com-gogo-protobuf-native \
    github.com-lightstep-lightstep-tracer-common-golang-gogo-native \
    github.com-opentracing-opentracing-go-native \
    github.com-shirou-gopsutil-v3-native \
    go.opencensus.io-native \
    google.golang.org-grpc-native \
"

GO_IMPORT = "github.com/lightstep/lightstep-tracer-go"

inherit gosrc
inherit native
