SUMMARY = "go.mod: github.com/hudl/fargo"
HOMEPAGE = "https://pkg.go.dev/github.com/hudl/fargo"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hudl-fargo-sources.inc

GO_IMPORT = "github.com/hudl/fargo"

inherit gosrc
inherit native
