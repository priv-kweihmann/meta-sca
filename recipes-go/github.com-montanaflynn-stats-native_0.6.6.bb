SUMMARY = "go.mod: github.com/montanaflynn/stats"
HOMEPAGE = "https://pkg.go.dev/github.com/montanaflynn/stats"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-montanaflynn-stats-sources.inc

GO_IMPORT = "github.com/montanaflynn/stats"

inherit gosrc
inherit native
