SUMMARY = "go.mod: github.com/goki/freetype"
HOMEPAGE = "https://pkg.go.dev/github.com/goki/freetype"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-goki-freetype-sources.inc

EXTRA_DEPENDS += "nativesdk-golang.org-x-image"
GO_IMPORT = "github.com/goki/freetype"
inherit gosrc
inherit nativesdk
