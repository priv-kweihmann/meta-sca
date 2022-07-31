SUMMARY = "go.mod: github.com/go-pdf/fpdf"
HOMEPAGE = "https://pkg.go.dev/github.com/go-pdf/fpdf"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-pdf-fpdf-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-boombuler-barcode \
    nativesdk-github.com-phpdave11-gofpdi \
    nativesdk-github.com-ruudk-golang-pdf417 \
    nativesdk-golang.org-x-image \
"
GO_IMPORT = "github.com/go-pdf/fpdf"
inherit gosrc
inherit nativesdk
