SUMMARY = "go.mod: github.com/fogleman/gg"
HOMEPAGE = "https://pkg.go.dev/github.com/fogleman/gg"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fogleman-gg-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-golang-freetype \
    nativesdk-golang.org-x-image \
"
GO_IMPORT = "github.com/fogleman/gg"
inherit gosrc
inherit nativesdk
