SUMMARY = "go.mod: github.com/go-martini/martini"
HOMEPAGE = "https://pkg.go.dev/github.com/go-martini/martini"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-martini-martini-sources.inc

EXTRA_DEPENDS += "\
    github.com-codegangsta-inject-native \
"

GO_IMPORT = "github.com/go-martini/martini"

inherit gosrc
inherit native
