SUMMARY = "go.mod: gioui.org"
HOMEPAGE = "https://pkg.go.dev/gioui.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gioui.org-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-gioui.org-cpu \
    nativesdk-gioui.org-shader \
    nativesdk-github.com-go-text-typesetting \
    nativesdk-golang.org-x-exp \
    nativesdk-golang.org-x-exp-shiny \
    nativesdk-golang.org-x-image \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-text \
"
GO_IMPORT = "gioui.org"
# fails to compile
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
