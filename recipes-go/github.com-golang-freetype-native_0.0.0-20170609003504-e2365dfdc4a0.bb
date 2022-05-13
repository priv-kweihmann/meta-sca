SUMMARY = "go.mod: github.com/golang/freetype"
HOMEPAGE = "https://pkg.go.dev/github.com/golang/freetype"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-golang-freetype-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-image-native \
"

GO_IMPORT = "github.com/golang/freetype"

inherit gosrc
inherit native
