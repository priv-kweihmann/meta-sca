SUMMARY = "go.mod: gioui.org/shader"
HOMEPAGE = "https://pkg.go.dev/gioui.org/shader"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gioui.org-shader-sources.inc

EXTRA_DEPENDS += "nativesdk-gioui.org-cpu"
GO_IMPORT = "gioui.org/shader"
inherit gosrc
inherit nativesdk
