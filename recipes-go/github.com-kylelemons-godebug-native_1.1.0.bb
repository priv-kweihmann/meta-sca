SUMMARY = "go.mod: github.com/kylelemons/godebug"
HOMEPAGE = "https://pkg.go.dev/github.com/kylelemons/godebug"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-kylelemons-godebug-sources.inc

GO_IMPORT = "github.com/kylelemons/godebug"

inherit gosrc
inherit native
