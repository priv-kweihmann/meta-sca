SUMMARY = "go.mod: github.com/yusufpapurcu/wmi"
HOMEPAGE = "https://pkg.go.dev/github.com/yusufpapurcu/wmi"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-yusufpapurcu-wmi-sources.inc

EXTRA_DEPENDS += "\
    github.com-go-ole-go-ole-native \
"

GO_IMPORT = "github.com/yusufpapurcu/wmi"

# fails with some very weird import error
do_compile[noexec] = "1"

inherit gosrc
inherit native
