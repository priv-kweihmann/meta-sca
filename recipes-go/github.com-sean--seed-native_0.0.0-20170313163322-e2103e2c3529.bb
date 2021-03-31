SUMMARY = "go.mod: github.com/sean-/seed"
HOMEPAGE = "https://pkg.go.dev/github.com/sean-/seed"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-sean--seed-sources.inc

GO_IMPORT = "github.com/sean-/seed"

inherit gosrc
inherit native
