SUMMARY = "go.mod: gioui.org/cpu"
HOMEPAGE = "https://pkg.go.dev/gioui.org/cpu"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gioui.org-cpu-sources.inc

GO_IMPORT = "gioui.org/cpu"
# fails to compile
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
