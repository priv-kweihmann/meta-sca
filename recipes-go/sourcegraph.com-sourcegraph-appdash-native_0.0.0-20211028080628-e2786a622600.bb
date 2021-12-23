SUMMARY = "go.mod: sourcegraph.com/sourcegraph/appdash"
HOMEPAGE = "https://pkg.go.dev/sourcegraph.com/sourcegraph/appdash"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require sourcegraph.com-sourcegraph-appdash-sources.inc

EXTRA_DEPENDS += "\
    github.com-gogo-protobuf-native \
    github.com-gorilla-mux-native \
    github.com-jessevdk-go-flags-native \
    github.com-opentracing-basictracer-go-native \
    github.com-opentracing-opentracing-go-native \
    github.com-urfave-negroni-native \
    sourcegraph.com-sourcegraph-appdash-data-native \
"

GO_IMPORT = "sourcegraph.com/sourcegraph/appdash"

inherit gosrc
inherit native
