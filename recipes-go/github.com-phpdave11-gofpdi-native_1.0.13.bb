SUMMARY = "go.mod: github.com/phpdave11/gofpdi"
HOMEPAGE = "https://pkg.go.dev/github.com/phpdave11/gofpdi"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-phpdave11-gofpdi-sources.inc

EXTRA_DEPENDS += "\
    github.com-pkg-errors-native \
"

GO_IMPORT = "github.com/phpdave11/gofpdi"

inherit gosrc
inherit native
