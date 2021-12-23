SUMMARY = "go.mod: github.com/martini-contrib/render"
HOMEPAGE = "https://pkg.go.dev/github.com/martini-contrib/render"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-martini-contrib-render-sources.inc

EXTRA_DEPENDS += "\
    github.com-go-martini-martini-native \
    github.com-oxtoacart-bpool-native \
"

GO_IMPORT = "github.com/martini-contrib/render"

inherit gosrc
inherit native
