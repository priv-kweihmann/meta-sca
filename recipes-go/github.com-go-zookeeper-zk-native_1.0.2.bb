SUMMARY = "go.mod: github.com/go-zookeeper/zk"
HOMEPAGE = "https://pkg.go.dev/github.com/go-zookeeper/zk"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-zookeeper-zk-sources.inc

GO_IMPORT = "github.com/go-zookeeper/zk"

inherit gosrc
inherit native
