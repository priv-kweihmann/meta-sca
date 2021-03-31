SUMMARY = "go.mod: github.com/davecgh/go-spew"
HOMEPAGE = "https://pkg.go.dev/github.com/davecgh/go-spew"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-davecgh-go-spew-sources.inc

GO_IMPORT = "github.com/davecgh/go-spew"

inherit gosrc
inherit native
