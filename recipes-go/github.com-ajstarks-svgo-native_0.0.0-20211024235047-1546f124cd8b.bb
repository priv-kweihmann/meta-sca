SUMMARY = "go.mod: github.com/ajstarks/svgo"
HOMEPAGE = "https://pkg.go.dev/github.com/ajstarks/svgo"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ajstarks-svgo-sources.inc

EXTRA_DEPENDS += "\
    github.com-ajstarks-deck-generate-native \
    honnef.co-go-tools-native \
"

GO_IMPORT = "github.com/ajstarks/svgo"

inherit gosrc
inherit native
