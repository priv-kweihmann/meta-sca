SUMMARY = "go.mod: github.com/census-instrumentation/opencensus-proto"
HOMEPAGE = "https://pkg.go.dev/github.com/census-instrumentation/opencensus-proto"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-census-instrumentation-opencensus-proto-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-grpc-ecosystem-grpc-gateway-v2 \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
"
GO_IMPORT = "github.com/census-instrumentation/opencensus-proto"
inherit gosrc
inherit nativesdk
