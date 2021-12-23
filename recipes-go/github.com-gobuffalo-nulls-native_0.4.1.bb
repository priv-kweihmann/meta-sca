SUMMARY = "go.mod: github.com/gobuffalo/nulls"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/nulls"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-nulls-sources.inc

EXTRA_DEPENDS += "\
    github.com-gofrs-uuid-native \
"

GO_IMPORT = "github.com/gobuffalo/nulls"

inherit gosrc
inherit native
