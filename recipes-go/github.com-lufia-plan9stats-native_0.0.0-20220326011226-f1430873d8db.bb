SUMMARY = "go.mod: github.com/lufia/plan9stats"
HOMEPAGE = "https://pkg.go.dev/github.com/lufia/plan9stats"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-lufia-plan9stats-sources.inc

GO_IMPORT = "github.com/lufia/plan9stats"

inherit gosrc
inherit native
