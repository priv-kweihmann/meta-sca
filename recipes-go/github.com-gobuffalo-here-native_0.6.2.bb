SUMMARY = "go.mod: github.com/gobuffalo/here"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/here"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-here-sources.inc

GO_IMPORT = "github.com/gobuffalo/here"

inherit gosrc
inherit native
