SUMMARY = "go.mod: github.com/gobuffalo/validate/v3"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/validate/v3"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-validate-v3-sources.inc

GO_IMPORT = "github.com/gobuffalo/validate/v3"

inherit gosrc
inherit native
