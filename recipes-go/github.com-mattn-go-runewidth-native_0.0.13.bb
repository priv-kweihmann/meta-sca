SUMMARY = "go.mod: github.com/mattn/go-runewidth"
HOMEPAGE = "https://pkg.go.dev/github.com/mattn/go-runewidth"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mattn-go-runewidth-sources.inc

EXTRA_DEPENDS += "\
    github.com-rivo-uniseg-native \
"

GO_IMPORT = "github.com/mattn/go-runewidth"

inherit gosrc
inherit native
