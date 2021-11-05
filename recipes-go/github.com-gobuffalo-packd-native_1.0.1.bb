SUMMARY = "go.mod: github.com/gobuffalo/packd"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/packd"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-packd-sources.inc

GO_IMPORT = "github.com/gobuffalo/packd"

inherit gosrc
inherit native
