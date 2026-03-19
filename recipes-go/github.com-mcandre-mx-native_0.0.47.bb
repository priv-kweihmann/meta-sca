SUMMARY = "go.mod: github.com/mcandre/mx"
HOMEPAGE = "https://pkg.go.dev/github.com/mcandre/mx"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mcandre-mx-sources.inc

EXTRA_DEPENDS += "\
    github.com-magefile-mage-native \
"

GO_IMPORT = "github.com/mcandre/mx"

inherit gosrc
inherit_defer native
