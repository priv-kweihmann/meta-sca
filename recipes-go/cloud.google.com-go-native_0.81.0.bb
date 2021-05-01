SUMMARY = "go.mod: cloud.google.com/go"
HOMEPAGE = "https://pkg.go.dev/cloud.google.com/go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require cloud.google.com-go-sources.inc

EXTRA_DEPENDS += "\
    cloud.google.com-go-storage-native \
    github.com-golang-mock-native \
    github.com-golang-protobuf-native \
    github.com-google-go-cmp-native \
    github.com-google-martian-v3-native \
    github.com-google-pprof-native \
    github.com-googleapis-gax-go-v2-native \
    github.com-jstemmer-go-junit-report-native \
    go.opencensus.io-native \
    golang.org-x-lint-native \
    golang.org-x-net-native \
    golang.org-x-oauth2-native \
    golang.org-x-text-native \
    golang.org-x-tools-native \
    google.golang.org-api-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
"

GO_IMPORT = "cloud.google.com/go"

inherit gosrc
inherit native
