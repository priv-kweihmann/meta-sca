SUMMARY = "go.mod: github.com/fyne-io/mobile"
HOMEPAGE = "https://pkg.go.dev/github.com/fyne-io/mobile"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fyne-io-mobile-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-image-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/fyne-io/mobile"

# fails to compile
do_compile[noexec] = "1"

inherit gosrc
inherit native
