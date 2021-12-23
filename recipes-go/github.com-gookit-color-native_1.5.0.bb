SUMMARY = "go.mod: github.com/gookit/color"
HOMEPAGE = "https://pkg.go.dev/github.com/gookit/color"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gookit-color-sources.inc

EXTRA_DEPENDS += "\
    github.com-xo-terminfo-native \
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/gookit/color"

inherit gosrc
inherit native
