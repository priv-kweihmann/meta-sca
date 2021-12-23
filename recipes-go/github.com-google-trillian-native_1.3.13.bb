SUMMARY = "go.mod: github.com/google/trillian"
HOMEPAGE = "https://pkg.go.dev/github.com/google/trillian"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-trillian-sources.inc

EXTRA_DEPENDS += "\
    bitbucket.org-creachadair-shell-native \
    cloud.google.com-go-spanner-native \
    contrib.go.opencensus.io-exporter-stackdriver-native \
    github.com-apache-beam-native \
    github.com-fullstorydev-grpcurl-native \
    github.com-go-redis-redis-native \
    github.com-go-sql-driver-mysql-native \
    github.com-golang-glog-native \
    github.com-golang-mock-native \
    github.com-golang-protobuf-native \
    github.com-google-btree-native \
    github.com-google-certificate-transparency-go-native \
    github.com-google-go-cmp-native \
    github.com-grpc-ecosystem-go-grpc-middleware-native \
    github.com-letsencrypt-pkcs11key-v4-native \
    github.com-lib-pq-native \
    github.com-prometheus-client-golang-native \
    github.com-prometheus-client-model-native \
    github.com-pseudomuto-protoc-gen-doc-native \
    go.etcd.io-etcd-native \
    go.opencensus.io-native \
    golang.org-x-crypto-native \
    golang.org-x-sync-native \
    golang.org-x-sys-native \
    golang.org-x-tools-native \
    google.golang.org-api-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/google/trillian"

# who ever made that weird mix of test/internal and cross reference should get fired
# version is simply not compilable
do_compile[noexec] = "1"

inherit gosrc
inherit native
