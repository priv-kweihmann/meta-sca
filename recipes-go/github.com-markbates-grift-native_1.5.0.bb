SUMMARY = "go.mod: github.com/markbates/grift"
HOMEPAGE = "https://pkg.go.dev/github.com/markbates/grift"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-markbates-grift-sources.inc

GO_IMPORT = "github.com/markbates/grift"

inherit gosrc
inherit native
