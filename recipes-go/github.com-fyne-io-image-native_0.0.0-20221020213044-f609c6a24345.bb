SUMMARY = "go.mod: github.com/fyne-io/image"
HOMEPAGE = "https://pkg.go.dev/github.com/fyne-io/image"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fyne-io-image-sources.inc

EXTRA_DEPENDS += "\
    github.com-jsummers-gobmp-native \
"

GO_IMPORT = "github.com/fyne-io/image"

inherit gosrc
inherit native
