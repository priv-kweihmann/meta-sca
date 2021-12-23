SUMMARY = "go.mod: contrib.go.opencensus.io/exporter/stackdriver"
HOMEPAGE = "https://pkg.go.dev/contrib.go.opencensus.io/exporter/stackdriver"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require contrib.go.opencensus.io-exporter-stackdriver-sources.inc

EXTRA_DEPENDS += "\
    cloud.google.com-go-monitoring-native \
    cloud.google.com-go-native \
    cloud.google.com-go-trace-native \
    github.com-aws-aws-sdk-go-native \
    github.com-census-instrumentation-opencensus-proto-native \
    github.com-golang-protobuf-native \
    github.com-google-go-cmp-native \
    github.com-jstemmer-go-junit-report-native \
    go.opencensus.io-native \
    golang.org-x-lint-native \
    golang.org-x-oauth2-native \
    golang.org-x-tools-native \
    google.golang.org-api-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
    honnef.co-go-tools-native \
"

GO_IMPORT = "contrib.go.opencensus.io/exporter/stackdriver"

# version is too far behind on cloud APIs - disable the compile
do_compile[noexec] = "1"

inherit gosrc
inherit native
