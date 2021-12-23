SUMMARY = "go.mod: github.com/zenazn/goji"
HOMEPAGE = "https://pkg.go.dev/github.com/zenazn/goji"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-zenazn-goji-sources.inc

EXTRA_DEPENDS += "\
    github.com-goji-param-native \
"

GO_IMPORT = "github.com/zenazn/goji"

inherit gosrc
inherit native
