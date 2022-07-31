SUMMARY = "go.mod: github.com/boombuler/barcode"
HOMEPAGE = "https://pkg.go.dev/github.com/boombuler/barcode"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-boombuler-barcode-sources.inc

GO_IMPORT = "github.com/boombuler/barcode"
inherit gosrc
inherit nativesdk
