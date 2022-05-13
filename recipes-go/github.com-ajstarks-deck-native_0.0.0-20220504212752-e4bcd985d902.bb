SUMMARY = "go.mod: github.com/ajstarks/deck"
HOMEPAGE = "https://pkg.go.dev/github.com/ajstarks/deck"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ajstarks-deck-sources.inc

EXTRA_DEPENDS += "\
    fyne.io-fyne-v2-native \
    gioui.org-native \
    github.com-ajstarks-deck-generate-native \
    github.com-ajstarks-fc-native \
    github.com-ajstarks-giocanvas-native \
    github.com-ajstarks-openvg-native \
    github.com-ajstarks-svgo-native \
    github.com-disintegration-gift-native \
    github.com-fogleman-gg-native \
    github.com-go-pdf-fpdf-native \
"

GO_IMPORT = "github.com/ajstarks/deck"

# fails to compile
do_compile[noexec] = "1"

inherit gosrc
inherit native
