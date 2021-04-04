SUMMARY = "go.mod: github.com/gobuffalo/fizz"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/fizz"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-fizz-sources.inc

GO_IMPORT = "github.com/gobuffalo/fizz"

inherit gosrc
inherit native
