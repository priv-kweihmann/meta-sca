SUMMARY = "go.mod: github.com/ajstarks/openvg"
HOMEPAGE = "https://pkg.go.dev/github.com/ajstarks/openvg"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ajstarks-openvg-sources.inc

EXTRA_DEPENDS += "nativesdk-github.com-disintegration-gift"
GO_IMPORT = "github.com/ajstarks/openvg"
# fails to compile
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
