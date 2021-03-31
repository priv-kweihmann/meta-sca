SUMMARY = "go.mod: github.com/mgechev/dots"
HOMEPAGE = "https://pkg.go.dev/github.com/mgechev/dots"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mgechev-dots-sources.inc

GO_IMPORT = "github.com/mgechev/dots"

inherit gosrc
inherit native
