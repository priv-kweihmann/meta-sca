SUMMARY = "go.mod: gonum.org/v1/plot"
HOMEPAGE = "https://pkg.go.dev/gonum.org/v1/plot"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gonum.org-v1-plot-sources.inc

EXTRA_DEPENDS += "\
    gioui.org-native \
    gioui.org-x-native \
    git.sr.ht--sbinet-gg-native \
    github.com-ajstarks-svgo-native \
    github.com-andybalholm-stroke-native \
    github.com-go-fonts-liberation-native \
    github.com-go-latex-latex-native \
    github.com-go-pdf-fpdf-native \
    golang.org-x-exp-native \
    golang.org-x-image-native \
    gonum.org-v1-gonum-native \
    rsc.io-pdf-native \
"

GO_IMPORT = "gonum.org/v1/plot"

# fails to compile
do_compile[noexec] = "1"

inherit gosrc
inherit native
