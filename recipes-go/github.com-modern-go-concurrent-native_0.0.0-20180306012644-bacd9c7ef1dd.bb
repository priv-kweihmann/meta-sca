SUMMARY = "go.mod: github.com/modern-go/concurrent"
HOMEPAGE = "https://pkg.go.dev/github.com/modern-go/concurrent"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-modern-go-concurrent-sources.inc

GO_IMPORT = "github.com/modern-go/concurrent"

inherit gosrc
inherit native
