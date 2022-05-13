SUMMARY = "go.mod: github.com/ajstarks/deck/generate"
HOMEPAGE = "https://pkg.go.dev/github.com/ajstarks/deck/generate"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ajstarks-deck-generate-sources.inc

EXTRA_DEPENDS += "\
    github.com-ajstarks-deck-native \
"

GO_IMPORT = "github.com/ajstarks/deck/generate"

inherit gosrc
inherit native
