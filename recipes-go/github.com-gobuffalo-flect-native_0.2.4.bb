SUMMARY = "go.mod: github.com/gobuffalo/flect"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/flect"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-flect-sources.inc

GO_IMPORT = "github.com/gobuffalo/flect"

inherit gosrc
inherit native
