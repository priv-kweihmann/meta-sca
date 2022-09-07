SUMMARY = "go.mod: gonum.org/v1/plot"
HOMEPAGE = "https://pkg.go.dev/gonum.org/v1/plot"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gonum.org-v1-plot-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-gioui.org \
    nativesdk-git.sr.ht--sbinet-gg \
    nativesdk-github.com-ajstarks-svgo \
    nativesdk-github.com-go-fonts-liberation \
    nativesdk-github.com-go-latex-latex \
    nativesdk-github.com-go-pdf-fpdf \
    nativesdk-golang.org-x-exp \
    nativesdk-golang.org-x-image \
    nativesdk-gonum.org-v1-gonum \
    nativesdk-rsc.io-pdf \
"
GO_IMPORT = "gonum.org/v1/plot"
# fails to compile
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
