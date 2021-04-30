SUMMARY = "go.mod: github.com/gobuffalo/buffalo"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/buffalo"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-buffalo-sources.inc

GO_IMPORT = "github.com/gobuffalo/buffalo"

inherit gosrc
inherit native
