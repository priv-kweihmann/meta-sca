SUMMARY = "go.mod: github.com/magiconair/properties"
HOMEPAGE = "https://pkg.go.dev/github.com/magiconair/properties"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-magiconair-properties-sources.inc

GO_IMPORT = "github.com/magiconair/properties"

inherit gosrc
inherit native
