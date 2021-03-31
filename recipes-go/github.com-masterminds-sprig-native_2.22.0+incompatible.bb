SUMMARY = "go.mod: github.com/Masterminds/sprig"
HOMEPAGE = "https://pkg.go.dev/github.com/Masterminds/sprig"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-masterminds-sprig-sources.inc

GO_IMPORT = "github.com/Masterminds/sprig"

inherit gosrc
inherit native
