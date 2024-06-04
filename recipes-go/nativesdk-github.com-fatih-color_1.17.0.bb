SUMMARY = "go.mod: github.com/fatih/color"
HOMEPAGE = "https://pkg.go.dev/github.com/fatih/color"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fatih-color-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-mattn-go-colorable \
    nativesdk-github.com-mattn-go-isatty \
    nativesdk-golang.org-x-sys \
"
GO_IMPORT = "github.com/fatih/color"
inherit gosrc
inherit_defer nativesdk
