SUMMARY = "go.mod: github.com/ajstarks/deck"
HOMEPAGE = "https://pkg.go.dev/github.com/ajstarks/deck"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ajstarks-deck-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-fyne.io-fyne-v2 \
    nativesdk-gioui.org \
    nativesdk-github.com-ajstarks-deck-generate \
    nativesdk-github.com-ajstarks-fc \
    nativesdk-github.com-ajstarks-giocanvas \
    nativesdk-github.com-ajstarks-openvg \
    nativesdk-github.com-ajstarks-svgo \
    nativesdk-github.com-disintegration-gift \
    nativesdk-github.com-fogleman-gg \
    nativesdk-github.com-go-pdf-fpdf \
"
GO_IMPORT = "github.com/ajstarks/deck"
# fails to compile
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
