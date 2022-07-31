SUMMARY = "go.mod: github.com/census-instrumentation/opencensus-proto"
HOMEPAGE = "https://pkg.go.dev/github.com/census-instrumentation/opencensus-proto"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-census-instrumentation-opencensus-proto-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-grpc-ecosystem-grpc-gateway \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/census-instrumentation/opencensus-proto"
inherit gosrc
inherit nativesdk
