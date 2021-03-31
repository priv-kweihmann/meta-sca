SUMMARY = "go.mod: github.com/armon/go-radix"
HOMEPAGE = "https://pkg.go.dev/github.com/armon/go-radix"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-armon-go-radix-sources.inc

GO_IMPORT = "github.com/armon/go-radix"

inherit gosrc
inherit native
