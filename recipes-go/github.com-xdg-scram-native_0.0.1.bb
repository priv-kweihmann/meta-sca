SUMMARY = "go.mod: github.com/xdg/scram"
HOMEPAGE = "https://pkg.go.dev/github.com/xdg/scram"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-xdg-scram-sources.inc

GO_IMPORT = "github.com/xdg/scram"

inherit gosrc
inherit native
