SUMMARY = "go.mod: github.com/apache/beam"
HOMEPAGE = "https://pkg.go.dev/github.com/apache/beam"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-apache-beam-sources.inc

EXTRA_DEPENDS += "\
    cloud.google.com-go-bigquery-native \
    cloud.google.com-go-datastore-native \
    cloud.google.com-go-pubsub-native \
    cloud.google.com-go-storage-native \
    github.com-golang-protobuf-native \
    github.com-google-go-cmp-native \
    github.com-linkedin-goavro-native \
    github.com-nightlyone-lockfile-native \
    github.com-spf13-cobra-native \
    golang.org-x-net-native \
    golang.org-x-oauth2-native \
    golang.org-x-text-native \
    google.golang.org-api-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/apache/beam"

# needs CGO
do_compile[noexec] = "1"

inherit gosrc
inherit native
