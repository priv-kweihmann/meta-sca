SUMMARY = "go.mod: github.com/ajstarks/giocanvas"
HOMEPAGE = "https://pkg.go.dev/github.com/ajstarks/giocanvas"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ajstarks-giocanvas-sources.inc

EXTRA_DEPENDS += "nativesdk-gioui.org"
GO_IMPORT = "github.com/ajstarks/giocanvas"
# fails to compile
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
