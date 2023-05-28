SUMMARY = "go.mod: gioui.org"
HOMEPAGE = "https://pkg.go.dev/gioui.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gioui.org-sources.inc

EXTRA_DEPENDS += "\
    gioui.org-cpu-native \
    gioui.org-shader-native \
    github.com-go-text-typesetting-native \
    golang.org-x-exp-native \
    golang.org-x-exp-shiny-native \
    golang.org-x-image-native \
    golang.org-x-sys-native \
    golang.org-x-text-native \
"

GO_IMPORT = "gioui.org"

# fails to compile
do_compile[noexec] = "1"

inherit gosrc
inherit native
