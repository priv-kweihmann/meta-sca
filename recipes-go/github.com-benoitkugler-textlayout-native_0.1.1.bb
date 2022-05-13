SUMMARY = "go.mod: github.com/benoitkugler/textlayout"
HOMEPAGE = "https://pkg.go.dev/github.com/benoitkugler/textlayout"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-benoitkugler-textlayout-sources.inc

EXTRA_DEPENDS += "\
    github.com-benoitkugler-pstokenizer-native \
    golang.org-x-image-native \
    golang.org-x-net-native \
    golang.org-x-text-native \
"

GO_IMPORT = "github.com/benoitkugler/textlayout"

inherit gosrc
inherit native
