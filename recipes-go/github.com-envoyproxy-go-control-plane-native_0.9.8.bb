SUMMARY = "go.mod: github.com/envoyproxy/go-control-plane"
HOMEPAGE = "https://pkg.go.dev/github.com/envoyproxy/go-control-plane"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-envoyproxy-go-control-plane-sources.inc

EXTRA_DEPENDS += "\
    github.com-census-instrumentation-opencensus-proto-native \
    github.com-cncf-udpa-go-native \
    github.com-envoyproxy-protoc-gen-validate-native \
    github.com-golang-protobuf-native \
    github.com-prometheus-client-model-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/envoyproxy/go-control-plane"

inherit gosrc
inherit native
