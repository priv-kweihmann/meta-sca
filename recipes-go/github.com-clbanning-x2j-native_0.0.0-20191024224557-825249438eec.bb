SUMMARY = "go.mod: github.com/clbanning/x2j"
HOMEPAGE = "https://pkg.go.dev/github.com/clbanning/x2j"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-clbanning-x2j-sources.inc

GO_IMPORT = "github.com/clbanning/x2j"

inherit gosrc
inherit native
