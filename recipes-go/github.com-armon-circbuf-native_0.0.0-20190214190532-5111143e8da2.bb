SUMMARY = "go.mod: github.com/armon/circbuf"
HOMEPAGE = "https://pkg.go.dev/github.com/armon/circbuf"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-armon-circbuf-sources.inc

GO_IMPORT = "github.com/armon/circbuf"

inherit gosrc
inherit native
