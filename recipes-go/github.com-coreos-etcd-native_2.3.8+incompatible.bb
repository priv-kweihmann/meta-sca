SUMMARY = "go.mod: github.com/coreos/etcd"
HOMEPAGE = "https://pkg.go.dev/github.com/coreos/etcd"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-coreos-etcd-sources.inc

EXTRA_DEPENDS += "\
    github.com-olekukonko-tablewriter-native \
"

GO_IMPORT = "github.com/coreos/etcd"

inherit gosrc
inherit native
