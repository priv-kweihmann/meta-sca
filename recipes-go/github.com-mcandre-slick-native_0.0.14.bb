SUMMARY = "go.mod: github.com/mcandre/slick"
HOMEPAGE = "https://pkg.go.dev/github.com/mcandre/slick"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mcandre-slick-sources.inc

EXTRA_DEPENDS += "\
    github.com-magefile-mage-native \
    github.com-mcandre-mage-extras-native \
    mvdan.cc-sh-v3-native \
"

GO_IMPORT = "github.com/mcandre/slick"

inherit gosrc
inherit_defer native
