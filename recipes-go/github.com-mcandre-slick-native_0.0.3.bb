SUMMARY = "go.mod: github.com/mcandre/slick"
HOMEPAGE = "https://pkg.go.dev/github.com/mcandre/slick"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mcandre-slick-sources.inc

EXTRA_DEPENDS += "\
    mvdan.cc-sh-native \
"

GO_IMPORT = "github.com/mcandre/slick"

inherit gosrc
inherit native
