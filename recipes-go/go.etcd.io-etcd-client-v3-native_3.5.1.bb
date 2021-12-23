SUMMARY = "go.mod: go.etcd.io/etcd/client/v3"
HOMEPAGE = "https://pkg.go.dev/go.etcd.io/etcd/client/v3"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.etcd.io-etcd-client-v3-sources.inc

EXTRA_DEPENDS += "\
    github.com-dustin-go-humanize-native \
    go.etcd.io-etcd-api-v3-native \
    go.etcd.io-etcd-client-pkg-v3-native \
    go.uber.org-zap-native \
    google.golang.org-grpc-native \
    sigs.k8s.io-yaml-native \
"

GO_IMPORT = "go.etcd.io/etcd/client/v3"

inherit gosrc
inherit native
