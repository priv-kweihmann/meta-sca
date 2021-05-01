SUMMARY = "go.mod: go.opencensus.io"
HOMEPAGE = "https://pkg.go.dev/go.opencensus.io"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.opencensus.io-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-groupcache-native \
    github.com-golang-protobuf-native \
    github.com-google-go-cmp-native \
    golang.org-x-net-native \
    google.golang.org-grpc-native \
"

GO_IMPORT = "go.opencensus.io"

inherit gosrc
inherit native
