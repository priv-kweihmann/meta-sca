SUMMARY = "go.mod: github.com/sony/gobreaker"
HOMEPAGE = "https://pkg.go.dev/github.com/sony/gobreaker"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-sony-gobreaker-sources.inc

GO_IMPORT = "github.com/sony/gobreaker"

inherit gosrc
inherit native
