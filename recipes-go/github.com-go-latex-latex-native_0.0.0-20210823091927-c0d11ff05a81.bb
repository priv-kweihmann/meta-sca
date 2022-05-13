SUMMARY = "go.mod: github.com/go-latex/latex"
HOMEPAGE = "https://pkg.go.dev/github.com/go-latex/latex"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-latex-latex-sources.inc

EXTRA_DEPENDS += "\
    github.com-fogleman-gg-native \
    github.com-go-pdf-fpdf-native \
    golang.org-x-image-native \
"

GO_IMPORT = "github.com/go-latex/latex"

inherit gosrc
inherit native
