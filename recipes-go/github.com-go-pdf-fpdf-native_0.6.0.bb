SUMMARY = "go.mod: github.com/go-pdf/fpdf"
HOMEPAGE = "https://pkg.go.dev/github.com/go-pdf/fpdf"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-pdf-fpdf-sources.inc

EXTRA_DEPENDS += "\
    github.com-boombuler-barcode-native \
    github.com-phpdave11-gofpdi-native \
    github.com-ruudk-golang-pdf417-native \
    golang.org-x-image-native \
"

GO_IMPORT = "github.com/go-pdf/fpdf"

inherit gosrc
inherit native
