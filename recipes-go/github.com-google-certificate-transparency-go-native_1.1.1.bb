SUMMARY = "go.mod: github.com/google/certificate-transparency-go"
HOMEPAGE = "https://pkg.go.dev/github.com/google/certificate-transparency-go"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-certificate-transparency-go-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-glog-native \
    github.com-golang-mock-native \
    github.com-golang-protobuf-native \
    github.com-google-trillian-native \
    github.com-juju-ratelimit-native \
    github.com-kylelemons-godebug-native \
    github.com-prometheus-client-golang-native \
    github.com-rs-cors-native \
    github.com-sergi-go-diff-native \
    github.com-tomasen-realip-native \
    go.etcd.io-etcd-native \
    golang.org-x-crypto-native \
    golang.org-x-net-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
"

GO_IMPORT = "github.com/google/certificate-transparency-go"

# trillian integration is completely broken
do_compile[noexec] = "1"

inherit gosrc
inherit native
