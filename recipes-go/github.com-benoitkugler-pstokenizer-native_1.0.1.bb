SUMMARY = "go.mod: github.com/benoitkugler/pstokenizer"
HOMEPAGE = "https://pkg.go.dev/github.com/benoitkugler/pstokenizer"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-benoitkugler-pstokenizer-sources.inc

GO_IMPORT = "github.com/benoitkugler/pstokenizer"

inherit gosrc
inherit native
