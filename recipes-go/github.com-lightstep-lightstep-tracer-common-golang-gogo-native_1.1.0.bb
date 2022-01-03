SUMMARY = "go.mod: github.com/lightstep/lightstep-tracer-common/golang/gogo"
HOMEPAGE = "https://pkg.go.dev/github.com/lightstep/lightstep-tracer-common/golang/gogo"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-lightstep-lightstep-tracer-common-golang-gogo-sources.inc

EXTRA_DEPENDS += "\
    github.com-gogo-protobuf-native \
    golang.org-x-net-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
"

GO_IMPORT = "github.com/lightstep/lightstep-tracer-common/golang/gogo"

UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+\.\d+\.\d+)"

inherit gosrc
inherit native
