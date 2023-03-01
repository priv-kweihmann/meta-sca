SUMMARY = "go.mod: github.com/ajstarks/fc"
HOMEPAGE = "https://pkg.go.dev/github.com/ajstarks/fc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ajstarks-fc-sources.inc

EXTRA_DEPENDS += "\
    fyne.io-fyne-native \
    fyne.io-fyne-v2-native \
"

GO_IMPORT = "github.com/ajstarks/fc"

# fails to compile
do_compile[noexec] = "1"

inherit gosrc
inherit native
