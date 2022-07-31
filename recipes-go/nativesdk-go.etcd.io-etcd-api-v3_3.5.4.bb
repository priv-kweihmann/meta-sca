SUMMARY = "go.mod: go.etcd.io/etcd/api/v3"
HOMEPAGE = "https://pkg.go.dev/go.etcd.io/etcd/api/v3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.etcd.io-etcd-api-v3-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-coreos-go-semver \
    nativesdk-github.com-gogo-protobuf \
    nativesdk-github.com-golang-protobuf \
    nativesdk-github.com-grpc-ecosystem-grpc-gateway \
    nativesdk-google.golang.org-genproto \
    nativesdk-google.golang.org-grpc \
"
GO_IMPORT = "go.etcd.io/etcd/api/v3"
inherit gosrc
inherit nativesdk
