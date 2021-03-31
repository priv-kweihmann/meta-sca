SUMMARY = "go.mod: github.com/Knetic/govaluate"
HOMEPAGE = "https://pkg.go.dev/github.com/Knetic/govaluate"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-knetic-govaluate-sources.inc

GO_IMPORT = "github.com/Knetic/govaluate"

inherit gosrc
inherit native
