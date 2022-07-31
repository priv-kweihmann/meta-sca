SUMMARY = "go.mod: github.com/ruudk/golang-pdf417"
HOMEPAGE = "https://pkg.go.dev/github.com/ruudk/golang-pdf417"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ruudk-golang-pdf417-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-boombuler-barcode \
    nativesdk-github.com-phpdave11-gofpdf \
"
GO_IMPORT = "github.com/ruudk/golang-pdf417"
inherit gosrc
inherit nativesdk
