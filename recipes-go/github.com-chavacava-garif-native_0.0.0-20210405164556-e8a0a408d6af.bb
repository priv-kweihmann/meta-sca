SUMMARY = "go.mod: github.com/chavacava/garif"
HOMEPAGE = "https://pkg.go.dev/github.com/chavacava/garif"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-chavacava-garif-sources.inc

GO_IMPORT = "github.com/chavacava/garif"

inherit gosrc
inherit native
