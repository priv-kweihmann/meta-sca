SUMMARY = "go.mod: github.com/opentracing/basictracer-go"
HOMEPAGE = "https://pkg.go.dev/github.com/opentracing/basictracer-go"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-opentracing-basictracer-go-sources.inc

EXTRA_DEPENDS += "\
    github.com-gogo-protobuf-native \
    github.com-opentracing-opentracing-go-native \
    golang.org-x-lint-native \
    golang.org-x-net-native \
"

GO_IMPORT = "github.com/opentracing/basictracer-go"

inherit gosrc
inherit native
