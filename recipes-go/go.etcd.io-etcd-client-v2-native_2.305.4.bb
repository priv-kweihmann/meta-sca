SUMMARY = "go.mod: go.etcd.io/etcd/client/v2"
HOMEPAGE = "https://pkg.go.dev/go.etcd.io/etcd/client/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.etcd.io-etcd-client-v2-sources.inc

EXTRA_DEPENDS += "\
    github.com-json-iterator-go-native \
    github.com-modern-go-reflect2-native \
    go.etcd.io-etcd-client-v3-native \
"

GO_IMPORT = "go.etcd.io/etcd/client/v2"

inherit gosrc
inherit native
