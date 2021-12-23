SUMMARY = "go.mod: go.etcd.io/etcd/api/v3"
HOMEPAGE = "https://pkg.go.dev/go.etcd.io/etcd/api/v3"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.etcd.io-etcd-api-v3-sources.inc

EXTRA_DEPENDS += "\
    github.com-coreos-go-semver-native \
    github.com-gogo-protobuf-native \
    github.com-golang-protobuf-native \
    github.com-grpc-ecosystem-grpc-gateway-native \
    google.golang.org-genproto-native \
    google.golang.org-grpc-native \
"

GO_IMPORT = "go.etcd.io/etcd/api/v3"

inherit gosrc
inherit native
