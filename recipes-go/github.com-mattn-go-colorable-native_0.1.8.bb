SUMMARY = "go.mod: github.com/mattn/go-colorable"
HOMEPAGE = "https://pkg.go.dev/github.com/mattn/go-colorable"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mattn-go-colorable-sources.inc
require github.com-mattn-go-isatty-sources.inc
require golang.org-x-sys-sources.inc

GO_IMPORT = "github.com/mattn/go-colorable"

inherit gosrc
inherit native
