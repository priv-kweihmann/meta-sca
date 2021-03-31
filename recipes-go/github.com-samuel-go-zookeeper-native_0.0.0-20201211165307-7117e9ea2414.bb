SUMMARY = "go.mod: github.com/samuel/go-zookeeper"
HOMEPAGE = "https://pkg.go.dev/github.com/samuel/go-zookeeper"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-samuel-go-zookeeper-sources.inc

GO_IMPORT = "github.com/samuel/go-zookeeper"

inherit gosrc
inherit native
