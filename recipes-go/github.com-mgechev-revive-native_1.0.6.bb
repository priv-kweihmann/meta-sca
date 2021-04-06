SUMMARY = "go.mod: github.com/mgechev/revive"
HOMEPAGE = "https://pkg.go.dev/github.com/mgechev/revive"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mgechev-revive-sources.inc

GO_IMPORT = "github.com/mgechev/revive"

inherit gosrc
inherit native
