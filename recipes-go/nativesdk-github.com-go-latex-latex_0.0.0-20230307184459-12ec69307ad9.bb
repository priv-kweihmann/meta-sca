SUMMARY = "go.mod: github.com/go-latex/latex"
HOMEPAGE = "https://pkg.go.dev/github.com/go-latex/latex"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-latex-latex-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-fogleman-gg \
    nativesdk-github.com-go-pdf-fpdf \
    nativesdk-golang.org-x-image \
"
GO_IMPORT = "github.com/go-latex/latex"
inherit gosrc
inherit nativesdk
