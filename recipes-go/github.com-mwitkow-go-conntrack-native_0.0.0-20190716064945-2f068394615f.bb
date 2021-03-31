SUMMARY = "go.mod: github.com/mwitkow/go-conntrack"
HOMEPAGE = "https://pkg.go.dev/github.com/mwitkow/go-conntrack"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mwitkow-go-conntrack-sources.inc

GO_IMPORT = "github.com/mwitkow/go-conntrack"

inherit gosrc
inherit native
