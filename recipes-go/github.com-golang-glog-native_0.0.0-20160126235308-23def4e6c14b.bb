SUMMARY = "go.mod: github.com/golang/glog"
HOMEPAGE = "https://pkg.go.dev/github.com/golang/glog"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-golang-glog-sources.inc

GO_IMPORT = "github.com/golang/glog"

inherit gosrc
inherit native
