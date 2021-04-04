SUMMARY = "go.mod: go.etcd.io/etcd"
HOMEPAGE = "https://pkg.go.dev/go.etcd.io/etcd"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require go.etcd.io-etcd-sources.inc

GO_IMPORT = "go.etcd.io/etcd"

# version is somehow broken
do_compile[noexec] = "1"

inherit gosrc
inherit native
