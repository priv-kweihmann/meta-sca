SUMMARY = "go.mod: go.etcd.io/etcd/client/v3"
HOMEPAGE = "https://pkg.go.dev/go.etcd.io/etcd/client/v3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.etcd.io-etcd-client-v3-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-dustin-go-humanize \
    nativesdk-go.etcd.io-etcd-api-v3 \
    nativesdk-go.etcd.io-etcd-client-pkg-v3 \
    nativesdk-go.uber.org-zap \
    nativesdk-google.golang.org-grpc \
    nativesdk-sigs.k8s.io-yaml \
"
GO_IMPORT = "go.etcd.io/etcd/client/v3"
inherit gosrc
inherit nativesdk
