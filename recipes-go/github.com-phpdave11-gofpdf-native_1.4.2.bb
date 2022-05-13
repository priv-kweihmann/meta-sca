SUMMARY = "go.mod: github.com/phpdave11/gofpdf"
HOMEPAGE = "https://pkg.go.dev/github.com/phpdave11/gofpdf"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-phpdave11-gofpdf-sources.inc

EXTRA_DEPENDS += "\
    github.com-boombuler-barcode-native \
    github.com-phpdave11-gofpdi-native \
    github.com-ruudk-golang-pdf417-native \
    golang.org-x-image-native \
"

GO_IMPORT = "github.com/phpdave11/gofpdf"

inherit gosrc
inherit native
