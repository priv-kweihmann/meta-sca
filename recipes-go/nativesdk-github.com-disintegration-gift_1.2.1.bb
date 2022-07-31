SUMMARY = "go.mod: github.com/disintegration/gift"
HOMEPAGE = "https://pkg.go.dev/github.com/disintegration/gift"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-disintegration-gift-sources.inc

GO_IMPORT = "github.com/disintegration/gift"
inherit gosrc
inherit nativesdk
